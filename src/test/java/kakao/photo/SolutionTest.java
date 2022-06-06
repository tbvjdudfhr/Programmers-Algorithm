package kakao.photo;

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
                        2,
                        new String[]{"N~F=0", "R~T>2"},
                        3648
                ),
                Arguments.of(
                        2,
                        new String[]{"M~C<2", "C~M>1"},
                        0
                )
        );
    }

    @DisplayName("모든 조건을 만족할 수 있도록 서는 경우의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 단체사진_찍기(int n, String[] data, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(n, data)).isEqualTo(result);
    }
}
