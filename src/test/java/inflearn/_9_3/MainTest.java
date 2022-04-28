package inflearn._9_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(Arrays.asList(Main.Wedding.of(14, 's'),
                                Main.Wedding.of(18, 'e'),
                                Main.Wedding.of(12, 's'),
                                Main.Wedding.of(15, 'e'),
                                Main.Wedding.of(15, 's'),
                                Main.Wedding.of(20, 'e'),
                                Main.Wedding.of(20, 's'),
                                Main.Wedding.of(30, 'e'),
                                Main.Wedding.of(5, 's'),
                                Main.Wedding.of(14, 'e'))
                        ),
                        new TreeSet<>(Arrays.asList(5, 12, 14, 15, 18, 20, 30)),
                        2
                )
        );
    }

    @DisplayName("피로연 장소에 동시에 존재하는 최대 인원수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 결혼식(ArrayList<Main.Wedding> input, TreeSet<Integer> input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
