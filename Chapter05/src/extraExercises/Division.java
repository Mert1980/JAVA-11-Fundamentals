package extraExercises;

public class Division {
    public static void main(String[] args) {

        System.out.println(divideByThree());
        System.out.println(divideByFive());
        System.out.println(divideByBoth());
    }
    public static String divideByThree(){
        String text = "";
        for (int i = 3; i < 100 ; i+=3) {
            text += i + " ";
        }
        return text;
    }
    public static String divideByFive(){
        String text = "";
        for (int i = 5; i < 100 ; i+=5) {
            text += i + " ";
        }
        return text;
    }
    public static String divideByBoth(){
        String text = "";
        for (int i = 3; i < 100 ; i++) {
            if(i %3 == 0 && i %5 == 0){
                text += i + " ";
            }
        }
        return text;
    }
}
