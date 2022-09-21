package leetcode._148;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._148.Solution.ListNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3)))),
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))
                )
        );
    }

    @DisplayName("연결 리스트의 선두가 주어졌을 때, 오름차순으로 정렬하여 리스트를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 정렬_목록(ListNode head, ListNode result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.sortList(head)).isEqualTo(result);
    }
}
