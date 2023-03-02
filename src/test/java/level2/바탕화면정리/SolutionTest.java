package level2.바탕화면정리;

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
                        new String[]{".#...", "..#..", "...#."},
                        new int[]{0, 1, 3, 4}
                ),
                Arguments.of(
                        new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."},
                        new int[]{1, 3, 5, 8}
                ),
                Arguments.of(
                        new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."},
                        new int[]{0, 0, 7, 9}
                )
        );
    }

    @DisplayName("머쓱이의 컴퓨터 바탕화면의 상태를 나타내는 문자열 배열 wallpaper가 매개변수로 주어질 때 바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는 드래그의 시작점과 끝점을 담은 정수 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 바탕화면_정리(String[] wallpaper, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(wallpaper)).isEqualTo(result);
    }
}