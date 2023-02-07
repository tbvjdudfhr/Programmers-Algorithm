package level2.호텔대실;

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
                        new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}},
                        3
                ),
                Arguments.of(
                        new String[][]{{"15:00", "17:00"}, {"14:20", "15:20"}, {"14:30", "14:50"}},
                        2
                ),
                Arguments.of(
                        new String[][]{{"15:00", "17:00"}, {"15:00", "15:10"}, {"15:20", "15:31"}, {"15:40", "15:50"}},
                        3
                )
        );
    }

    @DisplayName("예약 시각이 문자열 형태로 담긴 2차원 배열 book_time이 매개변수로 주어질 때, 코니에게 필요한 최소 객실의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 호텔_대실(String[][] book_time, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(book_time)).isEqualTo(result);
    }
}