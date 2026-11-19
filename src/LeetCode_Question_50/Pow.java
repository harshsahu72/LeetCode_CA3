
package LeetCode_Question_50;

class Solution {

    public double myPow(double x, int n) {

        long exp = n;

        if (exp < 0) {
            return 1.0 / power(x, -exp);
        }

        return power(x, exp);
    }

    private double power(double x, long exp) {

        if (exp == 0) {
            return 1.0;
        }

        double half = power(x, exp / 2);

        if (exp % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }
}

public class Pow {

    public static void main(String[] args) {

        Solution obj = new Solution();

        double x = 2.00000;
        int n = 10;

        double result = obj.myPow(x, n);

        System.out.println("Answer: " + result);
    }
}
