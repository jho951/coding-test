import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 네 주사위가 모두 같은 경우
        if (a == b && a == c && a == d) return 1111 * a;

        // 세 주사위가 같고, 나머지 하나가 다를 경우
        if (a == b && a == c) return (int) Math.pow(10 * a + d, 2);
        if (a == b && a == d) return (int) Math.pow(10 * a + c, 2);
        if (a == c && a == d) return (int) Math.pow(10 * a + b, 2);
        if (b == c && b == d) return (int) Math.pow(10 * b + a, 2);

        // 두 주사위씩 같은 값이 나온 경우
        if (a == b && c == d) return (a + c) * Math.abs(a - c);
        if (a == c && b == d) return (a + b) * Math.abs(a - b);
        if (a == d && b == c) return (a + b) * Math.abs(a - b);

        // 두 주사위가 같은 값이 나왔고, 나머지 두 개는 서로 다른 값인 경우
        if (a == b) return c * d;
        if (a == c) return b * d;
        if (a == d) return b * c;
        if (b == c) return a * d;
        if (b == d) return a * c;
        if (c == d) return a * b;

        // 네 주사위 값이 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}