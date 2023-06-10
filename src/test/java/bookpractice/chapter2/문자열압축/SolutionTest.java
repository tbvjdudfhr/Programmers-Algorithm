package bookpractice.chapter2.문자열압축;

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
                        "aabbaccc",
                        7
                ),
                Arguments.of(
                        "ababcdcdababcdcd",
                        9
                ),
                Arguments.of(
                        "abcabcdede",
                        8
                )
        );
    }

    @DisplayName("압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문자열_압축(String s, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}