class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        // 각 배열의 최대공약수 구하기
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }

        int answerA = satisfy(gcdA, arrayB) ? gcdA : 0;
        int answerB = satisfy(gcdB, arrayA) ? gcdB : 0;

        return Math.max(answerA, answerB);
    }

    // 최대공약수(Euclidean algorithm)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 배열의 모든 원소가 양의 정수 gcd로 나누어 떨어지지 않는지 확인
    private boolean satisfy(int gcd, int[] array) {
        for (int num : array) {
            if (num % gcd == 0) {
                return false;
            }
        }
        return true;
    }
}
