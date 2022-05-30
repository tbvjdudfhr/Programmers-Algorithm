package kakao.chat;

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
                        new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"},
                        new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."}
                )
        );
    }

    @DisplayName("최종적으로 방을 개설한 사람이 보게되는 메시지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 오픈채팅방(String[] record, String[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(record)).isEqualTo(result);
    }
}

