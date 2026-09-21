class Solution {
    public int solution(int sticker[]) {
        int n = sticker.length;

        // 스티커가 1개뿐인 경우 예외 처리
        if (n == 1) return sticker[0];
        // 스티커가 2개인 경우 둘 중 큰 값 리턴
        if (n == 2) return Math.max(sticker[0], sticker[1]);

        // 1. 첫 번째 스티커를 O 고르는 경우 (마지막 N-1번 스티커는 사용 불가)
        int[] dp1 = new int[n];
        dp1[0] = sticker[0];
        dp1[1] = sticker[0]; // 두 번째는 첫 번째와 인접하므로 선택 불가, 값 유지
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        // 2. 첫 번째 스티커를 X 고르지 않는 경우 (마지막 N-1번 스티커 선택 가능)
        int[] dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        // 두 경우 중 최댓값 반환
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
