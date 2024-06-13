/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 x 99
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

    public static void main(String[] args) {
        
        int largestPalindrome = 0;

        for (int i = 0; i < 1000; i++) {
            
            for (int j = i; j < 1000; j++) {

                if (isPalindrome(i * j) && (i * j) > largestPalindrome) {
                    
                    largestPalindrome = i * j;
                } 
            }
        }

        System.out.println(largestPalindrome);
    }

    public static boolean isPalindrome(int n) {

        String numStr = n + "";
        String[] strArray = numStr.split("");
        for (int i = 0; i < strArray.length / 2; i++) {

            if (strArray[i].compareTo(strArray[strArray.length-1-i]) != 0) {

                return false;
            }
        }

        return true;
    }
}