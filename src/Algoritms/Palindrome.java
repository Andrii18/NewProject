package Algoritms;

public class Palindrome {


//    For worlds

    public static boolean isPalindrome (String word) {

        boolean result = false;
        char[] array = word.toCharArray();
        for(int i = 0; i < array.length/2; i++) {
            if (array [i] != array[array.length-1-i]) {
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }


//    For numbers

    public static boolean isPalindrome1(int b) {
        boolean result = false;
        String a = Integer.toString(b);
        char[] array = a.toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array [i] != array[array.length-1-i]) {
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }
}
