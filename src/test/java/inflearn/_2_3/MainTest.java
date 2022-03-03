package inflearn._2_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 3, 3, 1, 3},
                        new int[]{1, 1, 2, 2, 3},
                        new String[]{"A", "B", "A", "B", "D"}
                )
        );
    }

    @DisplayName("A, B 두 사람이 가위바위보 이긴사람 이름 비길 경우 D를 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가위_바위_보(int[] a, int[] b, String[] result) {
        final inflearn._2_3.Main main = new inflearn._2_3.Main();

        assertThat(main.solution(a, b)).isEqualTo(result);
    }
}
