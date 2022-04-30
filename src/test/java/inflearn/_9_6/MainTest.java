package inflearn._9_6;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        new ArrayList<>(Arrays.asList(Main.Friend.of(1, 2),
                                Main.Friend.of(2, 3),
                                Main.Friend.of(3, 4),
                                Main.Friend.of(1, 5),
                                Main.Friend.of(6, 7),
                                Main.Friend.of(7, 8),
                                Main.Friend.of(8, 9))
                        ),
                        Main.Friend.of(3, 8),
                        "NO"
                )
        );
    }

    @DisplayName("학생의 친구관계를 나태내는 숫자쌍이 주어지면 특정 두명이 친구인지를 판별하는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 친구인가(int[] ints, ArrayList<Main.Friend> input, Main.Friend input2, String result) {
        Main.students = ints;
        input.forEach(it -> Main.union(it.first, it.second));
        assertThat(Main.solution(input2.first, input2.second)).isEqualTo(result);
    }
}
