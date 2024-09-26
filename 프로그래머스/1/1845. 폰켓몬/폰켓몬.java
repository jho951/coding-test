import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        // 중복 제거 후 새로운 배열 생성
        int[] newArr = Arrays.stream(nums).distinct().toArray();

        if (newArr.length > nums.length / 2) {
            return nums.length / 2; // 반환 타입을 int로 변경
        } else {
            return newArr.length; // else문에 조건이 필요 없음
        }
    }
}
