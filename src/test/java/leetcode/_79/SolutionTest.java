package leetcode._79;

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
                        new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                        "ABCCED",
                        true
                )
        );
    }

    @DisplayName("문자판의 m x n 그리드와 문자열 단어가 주어지면 단어가 그리드에 있으면 true를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 단어_검색(char[][] board, String word, boolean result) {
        Solution sol = new Solution();
        assertThat(sol.exist(board, word)).isEqualTo(result);
    }
}
