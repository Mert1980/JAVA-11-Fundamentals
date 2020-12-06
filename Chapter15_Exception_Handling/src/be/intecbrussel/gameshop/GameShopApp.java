package be.intecbrussel.gameshop;

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


        GameShop.Game game = gameShop.buyGame(GameShop.Game.CALL_OF_DUTY.getName(), mert);
        mert.play(game);

        game = gameShop.buyGame(GameShop.Game.FIFA21.getName(), mert);
        mert.play(game);

        game = gameShop.buyGame(GameShop.Game.FIFA21.getName(),mert);
        mert.play(game);

    }
}
