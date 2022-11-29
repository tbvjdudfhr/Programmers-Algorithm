package level2.typetest;

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
                        new String[]{"AN", "CF", "MJ", "RT", "NA"},
                        new int[]{1, 3, 4, 6},
                        "TCMA"
                ), Arguments.of(
                        new String[]{"TR", "RT", "TR"},
                        new int[]{1, 7, 1, 2},
                        "RCJA"
                )
        );
    }

    @DisplayName("검사자의 성격 유형 검사 결과를 지표 번호 순서 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 성격_유형_검사하기(String[] survey, int[] choices, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(survey, choices)).isEqualTo(result);
    }
}
