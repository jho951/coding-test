class Solution {
    public int solution(int[] schedules, int[][] timerecords, int startday) {
        int answer = 0;
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            // 출근 인정 기준 시각 계산 (희망 시각 + 10분)
            int limitTime = addTenMinutes(schedules[i]);
            boolean isPerfect = true;

            // 일주일(7일) 동안의 기록 확인
            for (int j = 0; j < 7; j++) {
                // 현재 요일 계산 (1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토, 7: 일)
                int currentDay = (startday + j - 1) % 7 + 1;

                // 토요일(6)과 일요일(7)은 지각 체크에서 제외
                if (currentDay == 6 || currentDay == 7) {
                    continue;
                }

                // 평일에 인정 기준 시각을 넘겨 출근했다면 지각
                if (timerecords[i][j] > limitTime) {
                    isPerfect = false;
                    break;
                }
            }

            // 평일에 모두 지각하지 않았다면 상품 대상자 추가
            if (isPerfect) {
                answer++;
            }
        }

        return answer;
    }

    // 시간 포맷(HHMM)에 10분을 더해주는 헬퍼 메서드
    private int addTenMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;

        minute += 10;
        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }

        return (hour * 100) + minute;
    }
}
