class Solution {
    static int[] answer = new int[2]; // 0의 개수, 1의 개수
    static int[][] map;

    public int[] solution(int[][] arr) {
        map = arr;
        quad(0, 0, arr.length);
        return answer;
    }

    public void quad(int x, int y, int size) {
        // 현재 영역이 모두 같은 값인지 확인
        if (check(x, y, size)) {
            if (map[x][y] == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
            return;
        }

        // 압축할 수 없다면 4개로 쪼개기 (4분할)
        int newSize = size / 2;
        quad(x, y, newSize);                     // 1사분면 (좌상)
        quad(x, y + newSize, newSize);             // 2사분면 (우상)
        quad(x + newSize, y, newSize);             // 3사분면 (좌하)
        quad(x + newSize, y + newSize, newSize);     // 4사분면 (우하)
    }

    // 영역 내부가 모두 같은 값인지 체크하는 함수
    public boolean check(int x, int y, int size) {
        int val = map[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}
