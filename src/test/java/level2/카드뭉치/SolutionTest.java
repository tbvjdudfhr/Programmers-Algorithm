package level2.카드뭉치;

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
                        new String[]{"i", "drink", "water"},
                        new String[]{"want", "to"},
                        new String[]{"i", "want", "to", "drink", "water"},
                        "Yes"
                ),
                Arguments.of(
                        new String[]{"i", "water", "drink"},
                        new String[]{"want", "to"},
                        new String[]{"i", "want", "to", "drink", "water"},
                        "No"
                )
        );
    }

    @DisplayName("문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 Yes를, 만들 수 없다면 No 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 카드_뭉치(String[] cards1, String[] cards2, String[] goal, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(cards1, cards2, goal)).isEqualTo(result);
    }
}
