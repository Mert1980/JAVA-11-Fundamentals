package be.intecbrussel.gameshop;

public class NotEnoughMoneyException extends RuntimeException {
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
