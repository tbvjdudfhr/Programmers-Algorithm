package bookpractice.chapter3.행렬의곱셈;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 4}, {3, 2}, {4, 1}},
                        new int[][]{{3, 3}, {3, 3}},
                        new int[][]{{15, 15}, {15, 15}, {15, 15}}
                ),
                Arguments.of(
                        new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}},
                        new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}},
                        new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
                )
        );
    }

    @DisplayName("2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 햏렬의_곱셈(int[][] arr1, int[][] arr2, int[][] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(arr1, arr2)).isEqualTo(result);
    }
}