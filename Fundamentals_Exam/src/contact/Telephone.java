package contact;

public class Telephone {
    private final int LENGTH_MOBILE = 10;
    private final int LENGTH_FIXED = 9;
    private String number;
    private String type;

    public Telephone(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public boolean isValidNumber(){
        if(!number.startsWith("0")){
            return false;
        }

        int numberOfDigits = number.length();
        if(type.equalsIgnoreCase("mobile") && numberOfDigits == 10){
            return true;
        }

        if(type.equalsIgnoreCase("fixed") && numberOfDigits == 9){
            return true;
        }

        return false;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return number;
    }
}
