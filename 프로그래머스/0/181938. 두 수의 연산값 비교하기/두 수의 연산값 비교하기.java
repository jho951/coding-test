import java.lang.*;
class Solution {
    public int solution(int a, int b) {
        int option1 = Integer.parseInt(a+""+ b);
        int option2 = 2 * a * b;
        return option1 > option2 ? option1 : option2;
    }
}