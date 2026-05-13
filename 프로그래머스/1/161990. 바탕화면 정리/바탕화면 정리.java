class Solution {
    public int[] solution(String[] wallpaper) {
        // 최소값은 최대치로, 최대값은 최소치로 초기화
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        // 2차원 배열(격자판) 전체 탐색
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                // 파일('#')을 발견했을 때 좌표 업데이트
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 끝점(rdx, rdy)은 최대 좌표에 +1을 해줍니다.
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
