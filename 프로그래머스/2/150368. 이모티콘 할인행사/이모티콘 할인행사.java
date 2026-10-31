class Solution {
    static int maxSubscriber = 0;
    static int maxSales = 0;
    static int[] discountRates = {10, 20, 30, 40};

    public int[] solution(int[][] users, int[] emoticons) {
        int[] discountedEmoticons = new int[emoticons.length];
        dfs(0, emoticons.length, users, emoticons, discountedEmoticons);
        
        return new int[]{maxSubscriber, maxSales};
    }

    // DFS를 통해 모든 이모티콘 할인율 조합 탐색
    private void dfs(int depth, int len, int[][] users, int[] emoticons, int[] discountedEmoticons) {
        if (depth == len) {
            evaluate(users, emoticons, discountedEmoticons);
            return;
        }

        for (int i = 0; i < 4; i++) {
            discountedEmoticons[depth] = discountRates[i];
            dfs(depth + 1, len, users, emoticons, discountedEmoticons);
        }
    }

    // 현재 할인율 조합에 대한 유저들의 구매 결과 계산
    private void evaluate(int[][] users, int[] emoticons, int[] discountedEmoticons) {
        int currentSubscriber = 0;
        int currentSales = 0;

        for (int[] user : users) {
            int userDiscountLimit = user[0]; // 유저가 원하는 최소 할인율
            int userPriceLimit = user[1];    // 유저가 플러스로 전환하는 기준 가격

            int sum = 0;
            for (int i = 0; i < emoticons.length; i++) {
                if (discountedEmoticons[i] >= userDiscountLimit) {
                    sum += emoticons[i] * (100 - discountedEmoticons[i]) / 100;
                }
            }

            if (sum >= userPriceLimit) {
                currentSubscriber++; // 플러스 구독
            } else {
                currentSales += sum; // 이모티콘 구매 비용 합산
            }
        }

        // 최적해 갱신 (가입자 수 우선, 같으면 판매액 우선)
        if (currentSubscriber > maxSubscriber) {
            maxSubscriber = currentSubscriber;
            maxSales = currentSales;
        } else if (currentSubscriber == maxSubscriber) {
            maxSales = Math.max(maxSales, currentSales);
        }
    }
}
