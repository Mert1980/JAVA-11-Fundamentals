package Test_Arrays_Mert_Demirok;

public class CharArrayTools {

    public char[] filterAlphabet(char[] arr){
        char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] newArr = new char [arr.length];
        int counter = 0;
        for (char letter:alphabet
             ) {
            for (int i = 0; i < arr.length ; i++) {
                if(letter == arr[i]){
                    newArr[counter] = letter;
                    counter++;
                }
            }
        }
        return newArr;
    }
}
