package search.prime;

import java.util.HashSet;

class Solution {
    HashSet<Integer> numbersSet = new HashSet<>();

    public int solution(String numbers) {
        makeNumbers("", numbers);

        return (int) numbersSet.stream()
                .filter(this::isPrime).count();
    }

    private void makeNumbers(String str, String numbers) {
        if (!str.equals("")) {
            numbersSet.add(Integer.valueOf(str));
        }

        for (int i = 0; i < numbers.length(); i++) {
            makeNumbers(str + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }

    private boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        int lim = (int) Math.sqrt(num);

        for (int i = 2; i <= lim; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
