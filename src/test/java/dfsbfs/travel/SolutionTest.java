package dfsbfs.travel;

import custom.CustomParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution sol = new Solution();

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}},
                        new String[]{"ICN", "JFK", "HND", "IAD"}
                ),
                Arguments.of(
                        new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}},
                        new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}
                )
        );
    }

    @CustomParameterizedTest
    @DisplayName("여행 경로 테스트")
    @MethodSource("args")
    void solutionTest(String[][] tickets, String[] result) {
        assertThat(sol.solution(tickets)).isEqualTo(result);
    }
}