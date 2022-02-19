package inflearn._1_1;

class Solution {
    public int solution(String str, char t) {
        String upperCaseStr = str.toUpperCase();
        char upperCaseT = Character.toUpperCase(t);

        return (int) upperCaseStr.chars().
                filter(value -> (char) value == upperCaseT)
                .count();
    }
}
