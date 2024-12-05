class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length){
            int temp1 = 0;
            int temp2 = 0;
            for(int i = 0; i< arr1.length; i++){
                temp1 += arr1[i];
                temp2 += arr2[i];
            }
            if(temp1 > temp2){
                answer = 1;
            }else if(temp1 < temp2){
                answer = -1;
            }else {
                answer = 0;
            }
        }else if(arr1.length < arr2.length){
            answer = -1;
        }else{
            answer = 1;
        }
        return answer;
    }
}