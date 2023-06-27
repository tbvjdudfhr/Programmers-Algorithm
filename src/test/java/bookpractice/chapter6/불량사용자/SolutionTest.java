package bookpractice.chapter6.불량사용자;


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
                        new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"},
                        new String[]{"fr*d*", "abc1**"},
                        2
                ),
                Arguments.of(
                        new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"},
                        new String[]{"*rodo", "*rodo", "******"},
                        2
                ),
                Arguments.of(
                        new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"},
                        new String[]{"fr*d*", "*rodo", "******", "******"},
                        3
                )
        );
    }

    @DisplayName("이벤트 응모자 아이디 목록이 담긴 배열 user_id와 불량 사용자 아이디 목록이 담긴 배열 banned_id가 매개변수로 주어질 때, 당첨에서 제외되어야 할 제재 아이디 목록은 몇가지 경우의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 불량_사용자(String[] user_id, String[] banned_id, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(user_id, banned_id)).isEqualTo(result);
    }
}