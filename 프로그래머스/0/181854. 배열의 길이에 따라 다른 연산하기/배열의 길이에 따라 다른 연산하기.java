class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            answer[i] = arr[i];
            if(arr.length % 2 == 0 && i % 2 != 0){
                answer[i] += n;
            }
            if(arr.length % 2 != 0 && i % 2 == 0){
                answer[i] += n;
            }
        }
        return answer;
    }
}