package kakao.map;

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
                        5,
                        new int[]{9, 20, 28, 18, 11},
                        new int[]{30, 1, 21, 17, 28},
                        new String[]{"#####", "# # #", "### #", "# ##", "#####"}
                ),
                Arguments.of(
                        6,
                        new int[]{46, 33, 33, 22, 31, 50},
                        new int[]{27, 56, 19, 14, 14, 10},
                        new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "}
                )
        );
    }

    @DisplayName("각 번호를 누른 손가락이 오른손인지 왼손인지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 키패드_누르기(int n, int[] arr1, int[] arr2, String[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(n, arr1, arr2)).isEqualTo(result);
    }
}
