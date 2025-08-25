//Mihir Anil
//AP CSA
//8-25-2025
public class StringOperations {
    public static void main(String[] args) {
        /* Challenge 1 asks to print a word that switches the last letter of the string with the first letter of the string 
        *  Challenge 2 asks to print ASCII art in one line of System.out.print
        */ 
        String word = "hello";
        int len = word.length();
        String firstLetter = word.substring (0,1);
        String lastLetter = word.substring(len-1);
        String middleLetter = word.substring (1, len-1);
        String result = lastLetter + middleLetter + firstLetter;
        System.out.println(result);
        System.out.print("|\\---/|\n| o_o |\n \\_^_/ ");
        //this was easier than I thought
    }


}