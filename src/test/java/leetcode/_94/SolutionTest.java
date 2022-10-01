package leetcode._94;

import leetcode._94.Solution.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
                        Arrays.asList(1, 3, 2)
                )
        );
    }

    @DisplayName("진 트리의 루트가 주어지면 노드 값의 중위 순회를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_트리_순회(TreeNode root, List<Integer> result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.inorderTraversal(root)).isEqualTo(result);
    }
}
