class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int linear = 0; // x의 계수 합
        int constant = 0; // 상수항의 합

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    linear += 1;
                } else {
                    // "3x"에서 "x"를 제거하고 "3"만 추출
                    linear += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 1. 일차항 처리
        if (linear > 0) {
            if (linear == 1) {
                sb.append("x");
            } else {
                sb.append(linear).append("x");
            }
        }

        // 2. 상수항 처리
        if (constant > 0) {
            if (linear > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }

        return sb.toString();
    }
}