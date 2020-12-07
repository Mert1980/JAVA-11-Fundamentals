package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exceptions.EmptyStockException;
import be.intecbrussel.gameshop.exceptions.GameNotFoundException;
import be.intecbrussel.gameshop.exceptions.NotEnoughMoneyException;
import be.intecbrussel.gameshop.exceptions.TooYoungToGameException;

import java.time.LocalDate;

public class GameShopApp {
    public static void main(String[] args) {

        GameShop gameShop = new GameShop(new Human("Mustafa", LocalDate.of(1988, 06, 14)));
        Stock stock = new Stock();
        stock.setAvengersAmount(1);
        stock.setCallOfDutyAmount(1);
        stock.setFifa21Amount(2);
        stock.setFortniteAmount(1);
        stock.setRobloxAmount(1);

        Client mert = new Client("Mert", LocalDate.of(2000, 06, 14));
        mert.setMoney(200);
        System.out.println(mert.getMoney());


        GameShop.Game game = null;
        try {
            game = gameShop.buyGame(GameShop.Game.CALL_OF_DUTY.getName(), mert);
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        } catch (TooYoungToGameException e) {
            e.printStackTrace();
        } catch (EmptyStockException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        mert.play(game);

        try {
            game = gameShop.buyGame(GameShop.Game.FIFA21.getName(), mert);
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        } catch (TooYoungToGameException e) {
            e.printStackTrace();
        } catch (EmptyStockException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        mert.play(game);

        try {
            game = gameShop.buyGame(GameShop.Game.FIFA21.getName(),mert);
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        } catch (TooYoungToGameException e) {
            e.printStackTrace();
        } catch (EmptyStockException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        mert.play(game);

    }
}
