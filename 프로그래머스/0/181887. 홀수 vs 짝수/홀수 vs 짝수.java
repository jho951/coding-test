class Solution {
    public int solution(int[] num_list) {
        int oddResult = 0;
        int evenResult = 0;
        for(int i =0; i< num_list.length; i++){
            if(i % 2 ==0){
                evenResult += num_list[i];
            }else{
                oddResult += num_list[i];
            }
        }
        return oddResult > evenResult ? oddResult : evenResult;
    }
}