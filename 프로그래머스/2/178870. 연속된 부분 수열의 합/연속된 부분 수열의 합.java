class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int sum = sequence[0];
        int minLen = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (left <= right && right < sequence.length) {
            if (sum == k) {
                // 조건을 만족하면 현재 길이를 확인하여 최단 길이일 때만 갱신
                int currentLen = right - left;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    answer[0] = left;
                    answer[1] = right;
                }
                // 다른 후보를 찾기 위해 왼쪽 포인터 이동
                sum -= sequence[left++];
            } else if (sum < k) {
                // 합이 k보다 작으면 오른쪽 포인터 이동
                right++;
                if (right < sequence.length) {
                    sum += sequence[right];
                }
            } else {
                // 합이 k보다 크면 왼쪽 포인터 이동
                sum -= sequence[left++];
            }
        }
        
        return answer;
    }
}