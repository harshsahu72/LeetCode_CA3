
package LeetCode_Question_41;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        int count = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == count) {
                count++;
            }
            else if (nums[i] > count) {
                return count;
            }
        }

        return count;
    }
}

public class FirstMissingPositive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 values for the array: ");

        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Solution s1 = new Solution();

        int res = s1.firstMissingPositive(nums);

        System.out.println("-------------------------------");
        System.out.println("The First Missing Positive is: " + res);

        sc.close();
    }
}
