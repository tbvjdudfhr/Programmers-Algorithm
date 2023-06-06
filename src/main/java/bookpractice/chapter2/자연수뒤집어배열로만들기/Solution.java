package bookpractice.chapter2.자연수뒤집어배열로만들기;

public class Solution {
    public int[] solution(long n) {
        return reverseNumberToArray(n);
    }

    public static int[] reverseNumberToArray(long number) {
        String numberString = String.valueOf(number);
        StringBuilder reversedString = new StringBuilder(numberString).reverse();
        int[] reversedArray = new int[reversedString.length()];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = Character.getNumericValue(reversedString.charAt(i));
        }

        return reversedArray;
    }
}