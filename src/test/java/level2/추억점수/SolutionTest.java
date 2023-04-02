package level2.추억점수;

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
                        new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}},
                        new int[]{19, 15, 6}
                ),
                Arguments.of(
                        new String[]{"kali", "mari", "don"},
                        new int[]{11, 1, 55},
                        new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}},
                        new int[]{67, 0, 55}
                ),
                Arguments.of(
                        new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}},
                        new int[]{5, 15, 0}
                )
        );
    }

    @DisplayName("그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 추억_점수(String[] name, int[] yearning, String[][] photo, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(name, yearning, photo)).isEqualTo(result);
    }
}