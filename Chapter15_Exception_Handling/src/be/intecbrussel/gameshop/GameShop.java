package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exceptions.EmptyStockException;
import be.intecbrussel.gameshop.exceptions.GameNotFoundException;
import be.intecbrussel.gameshop.exceptions.NotEnoughMoneyException;
import be.intecbrussel.gameshop.exceptions.TooYoungToGameException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Period;

public class GameShop {
    private Human seller;
    private Stock stock;

    public GameShop(Human seller) {
        this.seller = seller;
        this.stock = new Stock();
    }

    public Game buyGame(String gameName, Client client) throws GameNotFoundException, TooYoungToGameException, EmptyStockException, NotEnoughMoneyException {

        checkGame(gameName);
        checkAge(client.getBirthday(), gameName);
        checkStock(gameName);
        checkMoney(client, gameName);


        Game myGame = null;
        for (Game game:Game.values()
        ) {
            if(game.getName().equalsIgnoreCase(gameName)){
                myGame = game;
                break;
            }
        };
        client.setMoney(client.getMoney() - myGame.getPrice());
        return stock.gameSold(myGame);
    }

    private void checkStock(String gameName) throws EmptyStockException {
        String stockClassName = "be.intecbrussel.gameshop.Stock";
        Class<?> stockClass = null; // convert string classname to class
        try {
            stockClass = Class.forName(stockClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object stock = null; // invoke empty constructor
        try {
            stock = stockClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        String methodName = "get";
        for (Game game:Game.values()
        ) {
            if(game.getName().equalsIgnoreCase(gameName)){
                methodName+=gameName + "Amount";
                break;
            }
        };

        Method getNameMethod = null;
        try {
            getNameMethod = stock.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        int amount = 0;
        try {
            amount = (int) getNameMethod.invoke(stock);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if(amount <= 0){
            throw new EmptyStockException(gameName + " is out of stock! Please check later.");
        }
    }

    private Game checkGame(String gameName) throws GameNotFoundException{
        for (Game game:Game.values()) {
            if(game.getName().equalsIgnoreCase(gameName)){
                return game;
            }
        };
        throw new GameNotFoundException(gameName + " is not found. Please check another game.");
    }

    private void checkAge(LocalDate birthday, String gameName) throws TooYoungToGameException {
        LocalDate nowDate = LocalDate.now();
        Period period = Period.between(birthday, nowDate);

        if(period.getYears() < 18){
            throw new TooYoungToGameException("Your age must be over 18 to play " + gameName);
        }
    }

    private void checkMoney(Client client, String gameName) throws NotEnoughMoneyException{
        for (Game game:Game.values()) {
            if(game.getName().equalsIgnoreCase(gameName)){
                if(client.getMoney() >= game.getPrice()) return;
            }
        };
        throw new NotEnoughMoneyException("You don't have enough money to buy " + gameName);
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public enum Game {
        FORTNITE("Fortnite",30),
        CALL_OF_DUTY("CallOfDuty",40),
        FIFA21("Fifa21", 50),
        ROBLOX("Roblox", 30),
        AVENGERS("Avengers",45);

        private String name;
        private int price;

        Game(String name, int price) {
            this.price = price;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

}
