class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 1. 모든 시간을 초 단위로 변환
        int totalLen = toSeconds(video_len);
        int currentPos = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);

        for (String cmd : commands) {
            // 2. 명령어 수행 전 오프닝 구간 체크
            if (currentPos >= opStart && currentPos <= opEnd) {
                currentPos = opEnd;
            }

            // 3. 명령어에 따른 이동
            if (cmd.equals("prev")) {
                currentPos = Math.max(0, currentPos - 10);
            } else if (cmd.equals("next")) {
                currentPos = Math.min(totalLen, currentPos + 10);
            }
        }

        // 4. 마지막 이동 후 다시 한 번 오프닝 구간 체크
        if (currentPos >= opStart && currentPos <= opEnd) {
            currentPos = opEnd;
        }

        return fromSeconds(currentPos);
    }

    // "mm:ss" -> seconds 변환 함수
    private int toSeconds(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    // seconds -> "mm:ss" 변환 함수
    private String fromSeconds(int seconds) {
        int m = seconds / 60;
        int s = seconds % 60;
        return String.format("%02d:%02d", m, s);
    }
}
