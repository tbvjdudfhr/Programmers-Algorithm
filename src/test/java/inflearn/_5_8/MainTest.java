package inflearn._5_8;

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
                        2,
                        new int[]{60, 50, 70, 80, 90},
                        3
                ),
                Arguments.of(
                        3,
                        new int[]{70, 60, 90, 60, 60, 60},
                        4
                )
        );
    }

    @DisplayName("N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 응급실(int input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
