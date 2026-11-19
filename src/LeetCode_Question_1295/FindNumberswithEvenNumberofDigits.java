package LeetCode_Question_1295;

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int digits = 0;
            while (n > 0) {
                digits++;
                n /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(s.findNumbers(new int[]{555, 901, 482, 1771}));
        System.out.println(s.findNumbers(new int[]{100000}));
    }
}