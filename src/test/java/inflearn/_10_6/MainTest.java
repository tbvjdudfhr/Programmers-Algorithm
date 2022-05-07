package inflearn._10_6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest private static Stream<Arguments> args() {
    return Stream.of(
            Arguments.of(
                    15,
                    new int[]{1, 2, 5},
                    3
            )
    );
}

        @DisplayName("최대점수 테스트")
        @ParameterizedTest
        @MethodSource("args")
        void 최대점수_구하기(int input, int[] input2, int result) {
        }
}
