import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> countMap = new HashMap<>();

        // 1. 각 스테이지에 머무른 사람 수 카운트
        for (int stage : stages) {
            if (stage <= N) {
                countMap.put(stage, countMap.getOrDefault(stage, 0) + 1);
            }
        }

        // 2. 실패율 계산 및 저장
        List<StageFail> failList = new ArrayList<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            int current = countMap.getOrDefault(i, 0);
            double failRate = totalPlayers == 0 ? 0 : (double) current / totalPlayers;
            failList.add(new StageFail(i, failRate));
            totalPlayers -= current; // 다음 스테이지로 넘어감
        }

        // 3. 실패율 기준 내림차순 정렬 (같으면 스테이지 번호 오름차순)
        Collections.sort(failList, (a, b) -> {
            if (b.fail != a.fail) {
                return Double.compare(b.fail, a.fail);
            } else {
                return Integer.compare(a.stage, b.stage);
            }
        });

        // 4. 정답 배열에 스테이지 번호만 저장
        for (int i = 0; i < N; i++) {
            answer[i] = failList.get(i).stage;
        }

        return answer;
    }

    // 실패율과 스테이지 번호를 저장할 클래스
    static class StageFail {
        int stage;
        double fail;

        StageFail(int stage, double fail) {
            this.stage = stage;
            this.fail = fail;
        }
    }
}
