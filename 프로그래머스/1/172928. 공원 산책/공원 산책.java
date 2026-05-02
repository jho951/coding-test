class Solution {
    public int[] solution(String[] park, String[] routes) {
        int rLen = park.length;
        int cLen = park[0].length();
        int r = 0, c = 0;

        for (int i = 0; i < rLen; i++) {
            if (park[i].contains("S")) {
                r = i;
                c = park[i].indexOf("S");
                break;
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);

            int curR = r;
            int curC = c;
            boolean isPossible = true;

            // 3. 한 칸씩 이동하며 체크
            for (int i = 0; i < dist; i++) {
                if (dir.equals("E")) curC++;
                else if (dir.equals("W")) curC--;
                else if (dir.equals("S")) curR++;
                else if (dir.equals("N")) curR--;

                if (curR < 0 || curR >= rLen || curC < 0 || curC >= cLen || park[curR].charAt(curC) == 'X') {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                r = curR;
                c = curC;
            }
        }

        return new int[]{r, c};
    }
}
