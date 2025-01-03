class Solution {
    public int solution(int n) {
        int fac = 1;
        int i = 1;
        while (fac < n) { 
        fac *= i; 
        if(fac * i + 1 <= n){
          i++;   
        } 
    }
    return i;
    }
}