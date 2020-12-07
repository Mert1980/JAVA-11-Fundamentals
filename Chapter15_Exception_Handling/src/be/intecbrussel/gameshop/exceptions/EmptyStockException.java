package be.intecbrussel.gameshop.exceptions;

public class EmptyStockException extends Exception {
    public EmptyStockException(){
        super();
    }

    public EmptyStockException(String message){
        super(message);
    }

    public EmptyStockException(String message, Throwable cause){
        super(message, cause);
    }

    public EmptyStockException(Throwable cause){
        super(cause);
    }

}
