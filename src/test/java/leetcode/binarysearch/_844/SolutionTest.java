package leetcode.binarysearch._844;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "y#fo##f",
                        "y#f#o##f",
                        true
                ),
                Arguments.of(
                        "a#c",
                        "b",
                        false
                )
        );
    }

    @DisplayName("두 개의 문자열 s와 t가 주어지면 둘 다 빈 텍스트 편집기에 입력될 때 비교 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 백스페이스_문자열_비교(String s, String t, boolean result) {
        Solution sol = new Solution();
        assertThat(sol.backspaceCompare(s, t)).isEqualTo(result);
    }
}
