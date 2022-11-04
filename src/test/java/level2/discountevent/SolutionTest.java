package level2.discountevent;

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
                        new String[]{"banana", "apple", "rice", "pork", "pot"},
                        new int[]{3, 2, 2, 2, 1},
                        new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"},
                        3
                )
        );
    }

    @DisplayName("현이가 원하는 제품을 나타내는 문자열 배열 want와 정현이가 원하는 제품의 수량을 나타내는 정수 배열 number, XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount가 주어졌을 때, 회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 할인_행사(String[] want, int[] number, String[] discount, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(want, number, discount)).isEqualTo(result);
    }
}
