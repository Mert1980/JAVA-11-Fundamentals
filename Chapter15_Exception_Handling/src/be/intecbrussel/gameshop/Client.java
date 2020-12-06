package be.intecbrussel.gameshop;

import java.time.LocalDate;

public class Client extends Human {
    private int money;

    public Client(String name, LocalDate birthday) {
        this(name, birthday, 0);
    }

    public Client(String name, LocalDate birthday, int money) {
        super(name, birthday);
        this.setMoney(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money > 0){
            this.money = money;
        }
    }

    public void play(GameShop.Game game){
        System.out.println(super.getName() + " is playing " + game.name());
    }
}
