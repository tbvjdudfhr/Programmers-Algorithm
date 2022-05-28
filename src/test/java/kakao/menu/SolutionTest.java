package kakao.menu;

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
                        new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
                        new int[]{2, 3, 4},
                        new String[]{"AC", "ACDE", "BCFG", "CDE"}
                ),
                Arguments.of(
                        new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
                        new int[]{2, 3, 5},
                        new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}
                ),
                Arguments.of(
                        new String[]{"XYZ", "XWY", "WXA"},
                        new int[]{2, 3, 4},
                        new String[]{"WX", "XY"}
                )
        );
    }

    @DisplayName("새로 추가하게 될 코스요리의 메뉴 구성 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 메뉴_리뉴얼(String[] orders, int[] course, String[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(orders, course)).isEqualTo(result);
    }
}
