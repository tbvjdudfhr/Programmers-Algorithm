package leetcode._47;

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
                        new int[]{1, 1, 2},
                        Lists.newArrayList(
                                Arrays.asList(1, 1, 2),
                                Arrays.asList(1, 2, 1),
                                Arrays.asList(2, 1, 1)
                        )
                )
        );
    }

    @DisplayName("중복 숫자 배열에서 모든 고유 순열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 순열_2(int[] nums, List<List<Integer>> result) {
        Solution sol = new Solution();
        assertThat(sol.permuteUnique(nums)).isEqualTo(result);
    }
}
