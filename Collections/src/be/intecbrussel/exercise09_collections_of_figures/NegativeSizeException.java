package be.intecbrussel.exercise09_collections_of_figures;

public class NegativeSizeException extends IllegalArgumentException{

    public NegativeSizeException(){
        super();
    }

    public NegativeSizeException(String message){
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause){
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause){
        super(cause);
    }
}

