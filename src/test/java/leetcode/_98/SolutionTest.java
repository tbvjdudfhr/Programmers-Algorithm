package leetcode._98;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode._98.Solution.TreeNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        true
                )
        );
    }

    @DisplayName("이진 트리의 루트가 주어지면 유효한 이진 검색 트리(BST)인지 확인 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_검색_트리_검증(TreeNode root, boolean result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.isValidBST(root)).isEqualTo(result);
    }
}
