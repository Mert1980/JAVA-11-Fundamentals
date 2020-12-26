package contact;

public class Telephone {
    private final int LENGTH_MOBILE = 10;
    private final int LENGTH_FIXED = 9;
    private String number;
    private String type;

    public Telephone(String number, String type) {
        this.type = type;
        isValidNumber(number);
        this.number = number;
    }

    public boolean isValidNumber(String number) throws InvalidPhoneNumberException{
        if(!number.startsWith("0")){
            throw new InvalidPhoneNumberException("Invalid number. Number should start with 0");
        }

        int numberOfDigits = number.length();
        if(type.equalsIgnoreCase("mobile") && numberOfDigits != 10){
            throw new InvalidPhoneNumberException("Invalid GSM number. Should be 10 digits.");
        }

        if(type.equalsIgnoreCase("fixed") && numberOfDigits != 9){
            throw new InvalidPhoneNumberException("Invalid phone number. Should be 9 digits.");
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
