package leetcode._82;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._82.Solution.*;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))))),
                        new ListNode(1, new ListNode(2, new ListNode(5)))
                )
        );
    }

    @DisplayName("정렬된 연결리스트가 주어지면 중복 번호를 제거 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 정렬된_리스트_중복_제거(ListNode head, ListNode result) {
        Solution sol = new Solution();
        assertThat(sol.deleteDuplicates(head)).isEqualTo(result);
    }
}
