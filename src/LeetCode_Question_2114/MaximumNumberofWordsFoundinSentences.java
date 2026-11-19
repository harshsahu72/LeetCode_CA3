package LeetCode_Question_2114;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int words = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }
            max = Math.max(max, words);
        }
        return max;
    }
}

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.mostWordsFound(new String[]{
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        }));  // expected 6

        System.out.println(s.mostWordsFound(new String[]{
                "please wait",
                "continue to fight",
                "continue to win"
        }));  // expected 3

        System.out.println(s.mostWordsFound(new String[]{"hello"}));  // expected 1
    }
}