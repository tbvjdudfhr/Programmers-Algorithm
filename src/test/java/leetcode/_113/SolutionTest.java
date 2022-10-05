package leetcode._113;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static leetcode._113.Solution.TreeNode;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                        5,
                        new ArrayList<ArrayList<Integer>>()
                )
        );
    }

    @DisplayName("노드 값의 합이 targetSum과 같은 모든 루트-잎 경로를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 경로_합계_II(TreeNode root, int targetSum, List<List<Integer>> result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.pathSum(root, targetSum)).isEqualTo(result);
    }
}
