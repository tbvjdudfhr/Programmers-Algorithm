package leetcode._78;

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
                        new int[]{1, 2, 3},
                        Lists.newArrayList(
                                Arrays.asList(),
                                Arrays.asList(1),
                                Arrays.asList(2),
                                Arrays.asList(3),
                                Arrays.asList(1, 2),
                                Arrays.asList(1, 3),
                                Arrays.asList(2, 3),
                                Arrays.asList(1, 2, 3)
                        )
                )
        );
    }

    @DisplayName("정수 배열의 모든 부분 집합 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 부분_집합(int[] nums, List<List<Integer>> result) {
        Solution sol = new Solution();
        assertThat(sol.subsets(nums)).isEqualTo(result);
    }
}
