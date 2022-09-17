package leetcode._234;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._234.Solution.ListNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))),
                        true

                )
        );
    }

    @DisplayName("단일 연결 목록의 머리가 주어지면 회문이면 true를 반환하고 그렇지 않으면 false를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 회문_연결_목록(ListNode head, boolean result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.isPalindrome(head)).isEqualTo(result);
    }
}
