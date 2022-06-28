package kakao.compression;

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
                        "KAKAO",
                        new int[]{11, 1, 27, 15}
                ),
                Arguments.of(
                        "TOBEORNOTTOBEORTOBEORNOT",
                        new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34}
                ),
                Arguments.of(
                        "ABABABABABABABAB",
                        new int[]{1, 2, 27, 29, 28, 31, 30}
                )
        );
    }

    @DisplayName("압축 색인 번호 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 압축(String msg, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(msg)).isEqualTo(result);
    }
}
