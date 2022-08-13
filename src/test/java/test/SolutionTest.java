package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private  static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new String[]{"card", "ace13", "ace16", "banker", "ace17", "ace14"},
                        "ace15",
                        "ace15"
                ),
                Arguments.of(
                        new String[]{"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"},
                        "cow",
                        "cow10"
                ),
                Arguments.of(
                        new String[]{"bird99", "bird98", "bird101", "gotoxy"},
                        "bird98",
                        "bird100"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void solutionTest(String[] registered_list, String new_id, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(registered_list, new_id)).isEqualTo(result);
    }
}