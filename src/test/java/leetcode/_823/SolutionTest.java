package leetcode._823;

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
                        new int[]{2, 4},
                        3
                ),
                Arguments.of(
                        new int[]{2, 4, 5, 10},
                        7
                )
        );
    }

    @DisplayName("1보다 큰 고유 정수 배열에서 각 숫자를 여러번 사용해 이진 트리를 만들고 자식 노드의 곱이 부모 노드와 값이 같은 경우 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 요인이_있는_이진_트리(int[] arr, int result) {
        Solution sol = new Solution();
        assertThat(sol.numFactoredBinaryTrees(arr)).isEqualTo(result);
    }
}