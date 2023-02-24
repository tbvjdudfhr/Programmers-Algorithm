package level2.대충만든자판;

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
                        new String[]{"ABACD", "BCEFD"},
                        new String[]{"ABCD", "AABB"},
                        new int[]{9, 4}
                ),
                Arguments.of(
                        new String[]{"AA"},
                        new String[]{"B"},
                        new int[]{-1}
                ),
                Arguments.of(
                        new String[]{"AGZ", "BSSS"},
                        new String[]{"ASA", "BGZ"},
                        new int[]{4, 6}
                )
        );
    }

    @DisplayName("1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때, 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 대충_만든_자판(String[] keymap, String[] targets, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(keymap, targets)).isEqualTo(result);
    }
}