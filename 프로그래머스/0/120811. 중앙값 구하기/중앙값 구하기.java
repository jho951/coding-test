import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[Math.round(array.length / 2)];
    }
}

// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
//         for(int i = 0 ; i< array.length - 1; i++){
//             for(int j = i+1; j< array.length; j++){
//                 if(array[i] > array[j]){
//                     int temp = array[i];
//                     array[i] = array[j];
//                     array[j] = temp;
//                 }
//             }
//         }
//         return array[Math.round(array.length / 2)];
//     }
// }     