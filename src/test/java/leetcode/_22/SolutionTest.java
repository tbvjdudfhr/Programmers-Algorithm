package leetcode._22;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        3,
                        Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")
                )
        );
    }

    @DisplayName("n 쌍의 괄호가 주어지면 잘 구성된 괄호의 모든 조합을 생성하는 함수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 괄호_생성(int n, List<String> result) {
        Solution sol = new Solution();
        assertThat(sol.generateParenthesis(n)).isEqualTo(result);
    }
}
