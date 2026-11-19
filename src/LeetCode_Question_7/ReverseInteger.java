
package LeetCode_Question_7;

class Solution {
    public int reverse(int x) {

        int result = 0;

        while (x != 0) {

            int digit = x % 10;
            x /= 10;

            // Check positive integer overflow
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check negative integer overflow
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int x = 12345;

        int answer = obj.reverse(x);

        System.out.println("Reversed Integer: " + answer);
    }
}
