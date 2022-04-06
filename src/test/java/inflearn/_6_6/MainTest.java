package inflearn._6_6;

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
                        new int[]{120, 125, 152, 130, 135, 135, 143, 127, 160},
                        "3 8 "
                )
        );
    }

    @DisplayName("철수와 짝궁이 자리를 바꾼 반 학생들의 키 정보가 주어질 때 철수와 짝궁 번호 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 장난꾸러기(int[] input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
