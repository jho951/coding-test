class Solution {
    public int[] solution(int n) {
        int size = (n % 2 == 1) ? (n / 2) + 1 : (n / 2);
        int[] answer = new int[size];
        int a = 0 ;
        for(int i = 0 ; i<= n; i++){
            if(i % 2 == 1){
                answer[a]= i;
                a++;
            }
        }
        return answer;
    }
}