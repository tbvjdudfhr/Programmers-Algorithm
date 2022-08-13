package cafe.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();
    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                    new String[]{"abc", "abc", "dbc", "abcd"},
                    new String[]{"dbc", "abc", "abcd"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void solutionTest(String[] args, String[] result) {
        assertThat(sol.solution(args)).isEqualTo(result);
    }
}