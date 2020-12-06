package be.intecbrussel.gameshop;

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

    public Game buyGame(String gameName, Client client) throws EmptyStockException, GameNotFoundException,
            TooYoungToGameException, NotEnoughMoneyException{

        if(!isGameExist(gameName)){
            throw new GameNotFoundException(gameName + " is not found. Please check another game.");
        }

        if(!isAgeValid(client.getBirthday())){
            throw new TooYoungToGameException("Your age must be over 18 to play " + gameName);
        }

        if(!isInStock(gameName)){
            throw new EmptyStockException(gameName + " is out of stock! Please check later.");
        }

        if(!hasEnoughMoney(client, gameName)){
            throw new NotEnoughMoneyException("You don't have enough money to buy " + gameName);
        }

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

    private boolean isInStock(String gameName)  {
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
        return amount > 0;
    }

    private boolean isGameExist(String gameName){
        for (Game game:Game.values()) {
            if(game.getName().equalsIgnoreCase(gameName)){
                return true;
            }
        };
        return false;
    }

    private boolean isAgeValid(LocalDate birthday){
        LocalDate nowDate = LocalDate.now();
        Period period = Period.between(birthday, nowDate);
        return period.getYears() > 18;
    }

    private boolean hasEnoughMoney(Client client, String gameName){
        for (Game game:Game.values()) {
            if(game.getName().equalsIgnoreCase(gameName)){

                return client.getMoney() >= game.getPrice();
            }
        };
        return false;
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
