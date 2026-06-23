class Solution {
    public int solution(int[][] signals) {
        int n = signals.length;
        long maxTime = 1;

        // 1. 모든 신호등 주기의 최소공배수(LCM)를 구하여 탐색 한계선 설정
        for (int i = 0; i < n; i++) {
            long totalPeriod = signals[i][0] + signals[i][1] + signals[i][2];
            maxTime = lcm(maxTime, totalPeriod);
        }

        // 2. 1초부터 maxTime까지 순차 탐색
        for (int t = 1; t <= maxTime; t++) {
            boolean allYellow = true;

            for (int i = 0; i < n; i++) {
                int g = signals[i][0];
                int y = signals[i][1];
                int r = signals[i][2];
                int totalPeriod = g + y + r;

                // 현재 시각 t를 주기 내부의 시간대로 변환 (0일 경우 주기의 마지막 초로 보정)
                int remain = t % totalPeriod;
                if (remain == 0) {
                    remain = totalPeriod;
                }

                // 노란불 구간에 포함되는지 확인 (초록불 시간 초과 && 초록+노란불 시간 이하)
                if (!(remain > g && remain <= g + y)) {
                    allYellow = false;
                    break; // 하나라도 노란불이 아니면 현재 시간 t는 탈락
                }
            }

            // 모든 신호등이 노란불을 만족하는 최초의 시간 반환
            if (allYellow) {
                return t;
            }
        }

        // 최소공배수 주기 내에 만족하는 시간이 없으면 -1 반환
        return -1;
    }

    // 최대공약수(GCD) 구하기 - 유클리드 호제법
    private long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수(LCM) 구하기
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
