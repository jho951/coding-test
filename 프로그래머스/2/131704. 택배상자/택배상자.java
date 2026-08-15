import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int count = 0; // 트럭에 실은 상자 개수
        int box = 1;   // 메인 벨트에 1번 상자부터 시작
        Stack<Integer> subBelt = new Stack<>(); // 보조 컨테이너 벨트

        for (int i = 0; i < order.length; i++) {
            int target = order[i]; // 이번에 실어야 하는 상자 번호

            // 1. target 상자가 나올 때까지 메인 벨트 상자들을 보조 벨트에 넣기
            while (box <= order.length && box < target) {
                subBelt.push(box++);
            }

            // 2. target 상자가 메인 벨트의 현재 box 번호와 일치하는 경우
            if (box == target) {
                box++;
                count++;
            } 
            // 3. 메인 벨트에 없고 보조 벨트의 맨 위에 있는 경우
            else if (!subBelt.isEmpty() && subBelt.peek() == target) {
                subBelt.pop();
                count++;
            } 
            // 4. 둘 다 아니라면 더 이상 원하는 상자를 꺼낼 수 없음
            else {
                break;
            }
        }

        return count;
    }
}
