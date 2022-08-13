package leetcode._117;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}},
                        1
                ),
                Arguments.of(
                        new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0',}, {'0', '0', '1', '0', '0',}, {'0', '0', '0', '1', '1'}},
                        3

                )
        );
    }

//    @DisplayName("1(땅)과 0(물)의 지도를 나타내는 2차원 배열에서 섬의 갯수 테스트")
//    @ParameterizedTest
//    @MethodSource("args")
//    void 섬_갯수(char[][] grid, int result) {
//        Solution sol = new Solution();
//        assertThat(sol.connect()).isEqualTo(result);
//    }
}
