package level2.과제진행하기;

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
                        new String[][]{{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}},
                        new String[]{"korean", "english", "math"}
                ),
                Arguments.of(
                        new String[][]{{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}},
                        new String[]{"science", "history", "computer", "music"}
                ),
                Arguments.of(
                        new String[][]{{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}},
                        new String[]{"bbb", "ccc", "aaa"}
                )
        );
    }

    @DisplayName("과제 계획을 담은 이차원 문자열 배열 plans가 매개변수로 주어질 때, 과제를 끝낸 순서대로 이름을 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 과제_진행하기(String[][] plans, String[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(plans)).isEqualTo(result);
    }
}