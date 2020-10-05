package Exercise_05_05;

public class DataType {
    public static void main(String[] args){
        byte a;
        byte b;
        int c;

        a = 1;
        b= 2;
        // c = a + b; // incompatible types: possible lossy conversion from int to byte
        c = (a + b);
        System.out.println(c);

        int d = 2147483642;
        int e = 2147483645;

        long z = (long)d * e; // correct
        long z2 = (long)(d * e); // wrong



        System.out.println("z = " + z);
        System.out.println("z2 = " + z2);
    }
}
