package kakao.rank;

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
                        new String[]{"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"},
                        new String[]{"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"},
                        new int[]{1, 1, 1, 1, 2, 4}
                )
        );
    }

    @DisplayName("개발팀이 궁금해하는 문의조건 문자열 형태 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 순위_검색(String[] info, String[] query, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(info, query)).isEqualTo(result);
    }
}
