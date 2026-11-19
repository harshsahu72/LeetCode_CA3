
package LeetCode_Question_287;

class Solution {
    public int findDuplicate(int[] nums) {
        int lo = 1;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            int count = 0;

            for (int x : nums) {
                if (x <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}

public class FindtheDuplicateNumber {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        Solution obj = new Solution();

        int result = obj.findDuplicate(nums);

        System.out.println("Duplicate Number: " + result);
    }
}
