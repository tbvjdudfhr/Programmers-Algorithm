package kakao.cache;

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
                        3,
                        new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"},
                        50
                ),
                Arguments.of(
                        3,
                        new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"},
                        21
                ),
                Arguments.of(
                        2,
                        new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                        60
                ),
                Arguments.of(
                        5,
                        new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                        52
                ),
                Arguments.of(
                        3,
                        new String[]{"Jeju", "Pangyo", "NewYork", "newyork"},
                        16
                ),
                Arguments.of(
                        0,
                        new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"},
                        25
                )
        );
    }

    @DisplayName("캐시 크기에 따른 실행 시간 측정 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 캐시(int cacheSize, String[] cities, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(cacheSize, cities)).isEqualTo(result);
    }
}
