package LeetCode_Question_2469;

import java.util.Arrays;

class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}

public class ConverttheTemperature {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.convertTemperature(36.50)));   // [309.65, 97.7]
        System.out.println(Arrays.toString(sol.convertTemperature(122.11)));  // [395.26, 251.798]
    }
}