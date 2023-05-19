package baekjoon_test;

import baekjoon.Boj2018;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class Boj2018Test {

    @Test
    @DisplayName("최대 시작점 알아내기 테스트")
    void getMaxStartPointTest() {
        //given
        Boj2018 boj2018 = new Boj2018();
        int nTemp = 17;
        //when
        int maxStartPoint = boj2018.getMaxStartPoint(nTemp);
        //then
        assertThat(maxStartPoint).isEqualTo(9);

    }

    @ParameterizedTest
    @ValueSource(ints = {8,6,5})
    @DisplayName("시작점부터 1씩 줄여나가면서 더할떄 주어진 n을 만들 수 있는지 판단하는 메서드 테스트")
    void isPossibleStartTest(int start) {
        //given
        Boj2018 boj2018 = new Boj2018();
        int n = 15;
        //when
        boolean isValidStart = boj2018.isPossibleStart(n, start);
        //then
        assertThat(isValidStart).isTrue();
    }

    @Test
    @DisplayName("n이 주어졌을 때, 문제의 정답 return 메서드 테스트")
    void getCasesNumTest() {
        //given
        Boj2018 boj2018 = new Boj2018();
        int n = 15;
        //when
        int casesNum = boj2018.getCasesNum(n);
        //then
        assertThat(casesNum).isEqualTo(4);
    }
}
