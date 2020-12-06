package be.intecbrussel.gameshop;

public class EmptyStockException extends RuntimeException {
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
