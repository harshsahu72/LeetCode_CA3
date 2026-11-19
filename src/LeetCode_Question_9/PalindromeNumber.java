
package LeetCode_Question_9;

// LeetCode Question No. 9: Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {

        int x = 121;

        Solution obj = new Solution();

        boolean result = obj.isPalindrome(x);

        System.out.println("Input: " + x);
        System.out.println("Is Palindrome: " + result);
    }
}
