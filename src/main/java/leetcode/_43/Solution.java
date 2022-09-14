package leetcode._43;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<String> list = new ArrayList<>();
        int[] digits1 = new int[num1.length()];
        int max = 0;

        for (int i = 0; i < num1.length(); i++) {
            digits1[i] = Character.getNumericValue(num1.charAt(i));
        }

        for (int i = num2.length() - 1; i >= 0; i--) {
            int curr = Character.getNumericValue(num2.charAt(i));
            if (curr != 0) {
                String sub = multiply(curr, digits1, num2.length() - 1 - i);
                max = Math.max(max, sub.length());
                list.add(sub);
            }
        }
        int carries = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < max; i++) {
            int sum = carries;
            for (int j = 0; j < list.size(); j++) {
                String temp = list.get(j);
                if (temp.length() - 1 - i >= 0) {
                    sum += Character.getNumericValue(temp.charAt(temp.length() - 1 - i));
                }
            }
            int rem = sum % 10;
            result.append((char) (rem + '0'));
            carries = sum / 10;
        }
        if (carries > 0) {
            result.append(carries);
        }
        return result.reverse().toString();
    }

    public String multiply(int curr, int[] arr, int zeroes) {
        StringBuilder sb = new StringBuilder();
        int carries = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int prod = curr * arr[i] + carries;
            int rem = prod % 10;
            sb.append((char) (rem + '0'));
            carries = prod / 10;
        }
        if (carries > 0) {
            sb.append(carries);
        }
        return sb.reverse().append("0".repeat(zeroes)).toString();
    }
}
