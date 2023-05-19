package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2018 {

    /**
     * N이 주어졌을 떄, start를 N/2 부터 잡고 (N이 홀수면 N/2 +1 부터 ) start를 1까지 줄여나가면서 가지수를 count한다.
     */

    /**
     * n 이 주어졌을 때, 경우의 수를 고려하기 위한 최대 시작점 구하는 method
    * */
    public int getMaxStartPoint(int n) {
        if (n % 2 != 0) {
            return n/2 + 1;
        }
        return n/2;
    }

    /**
     * start부터 1씩 줄여나가면서 sum을 만들어나갈 떄, goalSum에 도달할 수 있는지 판단.
     */
    public boolean isPossibleStart(int goalSum, int start) {
        int sum = 0;
        while (goalSum > sum && start > 0) {
            sum += start--;
            if (sum == goalSum) {
                return true;
            }
        }
        return false;
    }

    /**
     * getResult method
     * n이 주어졌을 때, 가지수를 return
     * 자신으로 자신은 무조건 만들 수 있음.
     */
    public int getCasesNum(int n) {
        int maxStart = getMaxStartPoint(n);
        int casesNum = 1;
        while (maxStart > 0 ) {
            if (isPossibleStart(n, maxStart)) {
                casesNum++;
            }
            maxStart--;
        }
        return casesNum;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Boj2018().getCasesNum(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

}
