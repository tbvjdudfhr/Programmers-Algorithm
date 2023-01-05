package level2.개인정보수집유효기간;

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
                        "2022.05.19",
                        new String[]{"A 6", "B 12", "C 3"},
                        new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"},
                        new int[]{1, 3}
                ),
                Arguments.of(
                        "2020.01.01",
                        new String[]{"Z 3", "D 5"},
                        new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"},
                        new int[]{1, 4, 5}
                )
        );
    }

    @DisplayName("기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 개인정보_수집_유효기간(String today, String[] terms, String[] privacies, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(today, terms, privacies)).isEqualTo(result);
    }
}
