import java.util.HashSet;

class Solution {
    // 중복 제거를 위한 HashSet
    HashSet<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        // 1. 모든 조합 생성
        recursive("", numbers);

        // 2. 소수의 개수 카운트
        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // 재귀 함수로 순열 조합 생성
    public void recursive(String comb, String others) {
        // 현재 조합을 숫자로 변환해 Set에 추가 (빈 문자열이 아닐 때)
        if (!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }

        // 남은 종이 조각 중 하나를 선택해 조합에 붙이기
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    // 소수 판별 함수
    public boolean isPrime(int n) {
        // 0과 1은 소수가 아님
        if (n < 2) {
            return false;
        }

        // 제곱근까지만 나누어보기
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
