class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for ( int i=0; i< numbers.length; i++){
          answer+=  numbers[i];
        }
        return answer / numbers.length;
    }
}

// import java.util.Arrays;

// class Solution {
//     public double solution(int[] numbers) {
//         double answer = 0;
//         // 배열을 스트림으로 변환하여 순회
//         Arrays.stream(numbers).forEach(item -> System.out.println(item));
//         // 실제로 값을 계산하여 반환할 수 있도록 해야 함
//         answer = Arrays.stream(numbers).average().orElse(0); // 예시로 평균 계산
//         return answer;
//     }
// }