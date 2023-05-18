package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1740 {

    private BufferedReader br;

    public Boj1740() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * getNeededMaxVal
     * N번쨰 작은 수를 뽑기 위해서 3^maxVal 까지 조합에 필요하다
    * */
    public int getNeededMaxVal(long n) {
        int start = 1;
        while (Math.pow(2, start) - 1 < n) {
            start++;
        }
        return start - 1;
    }

    /**
     * 3^maxVal을 포함하는 가능한 모든 조합의 합을 List로 return 받는다?
     * 0, maxVal, 0,1 0,2
     * */

    /**
     * 1,3,9,27,81,243, 729...
     * 1까지 사용한다고 했을 때 2^1 - 1
     * 3까지 사용한다고 했을 때 2^2 - 1
     * 9까지 사용한다고 했을 떄 2^3 - 1
     * N번째로 작은 수를 만들기 위해 몇제곱까지 사용해야하는 지를 구한다. => int getNeedMaxVal()
     * N번째의 수는 maxVal -1 까지의 조합으로 만든 것을 제외하고 maxVal까지의 조합 중 새로운 수들 중 하나일 것이다.
     *      - maxVal을 무조건 포함하면서 만들 수 있는 합의 조합  중 적당한 수를 return 하도록.
    * */
}
