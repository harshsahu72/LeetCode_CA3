package LeetCode_Question_43;

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + pos[i + j + 1];

                pos[i + j + 1] = sum % 10;
                pos[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : pos) {
            if (sb.length() == 0 && digit == 0) continue;
            sb.append(digit);
        }
        return sb.toString();
    }
}

public class MultiplyStrings {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.multiply("2", "3"));        // expected 6
        System.out.println(s.multiply("123", "456"));    // expected 56088
        System.out.println(s.multiply("0", "9999"));     // expected 0
        System.out.println(s.multiply("999", "999"));    // expected 998001
    }
}