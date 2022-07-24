package leetcode._202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            String number = String.valueOf(n);
            char[] charArray = number.toCharArray();
            n = 0;
            for(int i = 0; i < charArray.length; i++) {
                n += Character.getNumericValue(charArray[i]) * Character.getNumericValue(charArray[i]);
            }
        }

        return n == 1;
    }
}
