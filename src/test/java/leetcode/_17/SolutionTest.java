package leetcode._17;

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
                        "23",
                        Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")
                )
        );
    }

    @DisplayName("2에서 9까지의 숫자를 포함하는 문자열이 주어지면 숫자가 나타낼 수 있는 모든 가능한 문자 조합을 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 전화번호의_문자_조합(String digits, List<String> result) {
       Solution sol = new Solution();
        assertThat(sol.letterCombinations(digits)).isEqualTo(result);
    }
}
