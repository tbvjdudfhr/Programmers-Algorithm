package pccp._3.유전법칙;

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
                        new int[][]{{3, 5}},
                        new String[]{"RR"}
                ),
                Arguments.of(
                        new int[][]{{3, 8}, {2, 2}},
                        new String[]{"rr", "Rr"}
                ),
                Arguments.of(
                        new int[][]{{3, 1}, {2, 3}, {3, 9}},
                        new String[]{"RR", "Rr", "RR"}
                ),
                Arguments.of(
                        new int[][]{{4, 26}},
                        new String[]{"Rㄱ"}
                )
        );
    }

    @DisplayName("형질을 알고 싶은 완두콩의 세대를 나타내는 정수 n과, 해당 완두콩이 세대 내에서 몇 번째 개체인지를 나타내는 정수 p가 2차원 정수 배열 queries의 원소로 주어집니다. queries에 담긴 순서대로 n세대의 p 번째 개체의 형질을 문자열 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 유전법칙(int[][] queries, String[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(queries)).isEqualTo(result);
    }
}