
package LeetCode_Question_412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            else if (i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 15;

        List<String> result = obj.fizzBuzz(n);

        System.out.println(result);
    }
}
