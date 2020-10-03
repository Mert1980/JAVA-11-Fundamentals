package Exercise_05_03;

public class TypeConversie {
    public static void main(String[] args){
        byte aByte;
        short aShort;
        int anInt;
        char aChar = 'a';

        // aShort = aChar; java: incompatible types: possible lossy conversion from char to short
        anInt = aChar;

        aShort =115;
        aByte = (byte) aShort; // without type conversion incompatible types: possible lossy conversion from short to byte

        System.out.println(aByte); // returns -128

        byte a = 5;
        // byte b = -a; - operator returns integer and can not be assigned to byte

        byte b = --a; // -- operator returns a result with a same type
        System.out.println(b);

        char c = 'a';
       // c = c + 1;  returns error because the result is integer
        c++;
        System.out.println(c); // result is 'b' ==> char
    }
}
