package inflearn._2_8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(87, 89, 92, 100, 76),
                        Arrays.asList(100, 92, 89, 87, 76)
                )
        );
    }

    @DisplayName("내림차순 정렬 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 등수구하기(List input, List result) {
        assertThat(Main.reverseOrderList(input)).isEqualTo(result);
    }
}
