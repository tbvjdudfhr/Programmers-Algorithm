package leetcode._19;

import leetcode._19.Solution.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        2,
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))

                )
        );
    }

    @DisplayName("연결 목록의 헤드가 주어지면 목록 끝에서 n번째 노드를 제거하고 헤드를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 목록_끝에서_N번째_노드_제거(ListNode head, int n, ListNode result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.removeNthFromEnd(head, n)).isEqualTo(result);
    }
}

