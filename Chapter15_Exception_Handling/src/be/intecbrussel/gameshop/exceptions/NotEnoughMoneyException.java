package be.intecbrussel.gameshop.exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(){
        super();
    }

    public NotEnoughMoneyException(String message){
        super(message);
    }

    public NotEnoughMoneyException(String message, Throwable cause){
        super(message, cause);
    }

    public NotEnoughMoneyException(Throwable cause){
        super(cause);
    }
}
