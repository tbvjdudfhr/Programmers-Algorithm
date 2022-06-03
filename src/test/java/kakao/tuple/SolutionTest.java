package kakao.tuple;

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
                        "{{2},{2,1},{2,1,3},{2,1,3,4}}",
                        new int[]{2, 1, 3, 4}

                ),
                Arguments.of(
                        "{{1,2,3},{2,1},{1,2,4,3},{2}}",
                        new int[]{2, 1, 3, 4}
                ),
                Arguments.of(
                        "{{20,111},{111}}",
                        new int[]{111, 20}
                ),
                Arguments.of(
                        "{{123}}",
                        new int[]{123}
                ),
                Arguments.of(
                        "{{4,2,3},{3},{2,3,4,1},{2,3}}",
                        new int[]{3, 2, 4, 1}
                )
        );
    }

    @DisplayName("튜플을 배열에 담는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 튜플(String s, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(s)).isEqualTo(result);
    }
}
