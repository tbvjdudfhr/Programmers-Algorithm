package leetcode._39;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 3, 6, 7},
                        7,
                        Lists.list(Arrays.asList(2, 2, 3), Arrays.asList(7))
                )
        );
    }

    @DisplayName("정수 배열과 타겟이 주어지면 선택한 숫자의 합이 타켓이 되는 조합의 목록 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 조합_합계(int[] candidates, int target, List<List<Integer>> result) {
        Solution sol = new Solution();
        assertThat(sol.combinationSum(candidates, target)).isEqualTo(result);
    }
}
