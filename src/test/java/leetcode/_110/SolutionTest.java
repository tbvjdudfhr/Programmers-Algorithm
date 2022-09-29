package leetcode._110;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._110.Solution.TreeNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))),
                        true
                )
        );
    }

    @DisplayName("이진 트리가 주어지면 높이 균형이 맞는지 확인합니다. 이 문제에서 높이 균형 이진 트리는 다음과 같이 정의됩니다. 모든 노드의 왼쪽 및 오른쪽 하위 트리의 높이가 1 이하로 다른 이진 트리 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 균형_이진_트리(TreeNode root, boolean result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.isBalanced(root)).isEqualTo(result);
    }
}

