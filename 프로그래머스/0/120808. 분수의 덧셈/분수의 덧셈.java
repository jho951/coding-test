class Solution {
  public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 두 분수의 합을 계산
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        // 2. 분자와 분모의 최대공약수 계산
        int gcd = gcd(numer, denom);

        // 3. 기약 분수로 만들기
        numer /= gcd;
        denom /= gcd;

        return new int[] { numer, denom };
    }

    // 최대공약수 계산 함수 (유클리드 알고리즘)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}