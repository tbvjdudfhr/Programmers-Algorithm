package kakao.key;

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
                        new String[][]{
                                {"100", "ryan", "music", "2"},
                                {"200", "apeach", "math", "2"},
                                {"300", "tube", "computer", "3"},
                                {"400", "con", "computer", "4"},
                                {"500", "muzi", "music", "3"},
                                {"600", "apeach", "music", "2"}
                        },
                        2
                )
        );
    }

    @DisplayName("릴레이션이서 후보 키의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 후보키(String[][] relation, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(relation)).isEqualTo(result);
    }
}
