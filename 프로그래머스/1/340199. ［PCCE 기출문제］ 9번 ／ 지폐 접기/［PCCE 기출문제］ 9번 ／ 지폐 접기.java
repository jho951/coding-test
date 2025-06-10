class Solution {
//     public int solution(int[] wallet, int[] bill) {
//         int answer = 0;
//         while(true){
//             // 지폐 가로가 지갑 가로보다 길 때
//             if(bill[0] > wallet[0]){
//                 // 지폐 가로가 지갑 세로보다 길 때
//                 if(bill[0] > wallet[1]){
//                     // 지폐 가로가 길 때
//                     if(bill[0] > bill[1]){
//                         answer++;
//                         bill[0] /= 2;
//                     // 지폐 세로가 길 때
//                     }else{
//                         answer++;
//                         bill[1] /= 2;
//                     }
//                 // 지폐 가로가 지갑 세로보다 짧을 때    
//                 }else if(bill[0] <= wallet[1]){
//                     // 지폐 세로가 지갑 가로보다 길 때
//                     if(bill[1] > wallet[0]){
//                         // 지폐 가로가 길 때
//                         if(bill[0] > bill[1]){
//                             answer++;
//                             bill[0] /= 2;
//                         // 지폐 세로가 길 때
//                         }else{
//                             answer++;
//                             bill[1] /= 2;
//                         }
//                     // 지폐 세로가 지갑 가로보다 짧을 때
//                     }else if(bill[1] <= wallet[0]){
//                         return answer;
//                     }
//                 }
//             // 지폐 가로가 지갑 가로보다 짧을 때
//             }else if(bill[0] <= wallet[0]){
//                 // 지폐 세로가 지갑 세로보다 길 때
//                 if(bill[1] > wallet[1]){
//                     if(bill[1] > wallet[0]){
//                         // 지폐 가로가 길 때
//                         if(bill[0] > bill[1]){
//                             answer++;
//                             bill[0] /= 2;
//                         // 지폐 세로가 길 때
//                         }else{
//                             answer++;
//                             bill[1] /= 2;
//                         }
//                     }
//                 // 지폐 세로가 지갑 세로보다 짧을 때
//                 }else if(bill[1] <= wallet[1]){
//                     return answer;
//                 }
//             }
//         } 
//     }
    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            // 들어갈 수 있는지 확인
            if ((bill[0] <= wallet[0] && bill[1] <= wallet[1]) ||
                (bill[1] <= wallet[0] && bill[0] <= wallet[1])) {
                return answer;
            }

            // 더 긴 쪽을 접기
            if (bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            answer++;

            // 안전장치: 너무 작아지면 종료
            if (bill[0] == 0 || bill[1] == 0) {
                return -1; // 넣을 수 없음
            }
        }
    }
}