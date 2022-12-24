package level2.테이블해시함수;

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
                        new int[][]{{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}},
                        2,
                        2,
                        3,
                        4
                )
        );
    }

    @DisplayName("테이블의 데이터 data와 해시 함수에 대한 입력 col, row_begin, row_end이 주어졌을 때 테이블의 해시 값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 테이블_해시_함수(int[][] data, int col, int row_begin, int row_end, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(data, col, row_begin, row_end)).isEqualTo(result);
    }
}
