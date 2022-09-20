package leetcode._328;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._328.Solution.ListNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))))
                )
        );
    }

    @DisplayName("단일 연결 목록의 헤드가 주어지면 홀수 인덱스를 가진 모든 노드를 그룹화하고 짝수 인덱스를 가진 노드를 그룹화하고 재정렬된 목록을 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 홀수_짝수_연결_리스트(ListNode head, ListNode result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.oddEvenList(head)).isEqualTo(result);
    }
}

