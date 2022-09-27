package leetcode._226;

import leetcode._226.Solution.TreeNode;
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
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(1))
                )
        );
    }

    @DisplayName("이진 트리의 루트가 주어지면 트리를 반전하고 루트를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_트린_반전(TreeNode root, TreeNode result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.invertTree(root)).isEqualTo(result);
    }
}
