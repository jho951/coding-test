import java.util.*;

class Solution {
    public String[] solution(String[] expressions) {
        String[] answer = {};
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));
        List<String> unsolves = new ArrayList<>();
        String fNum, sNum, rNum;
        int oper;
        
        for(String expression : expressions) {
            fNum = expression.split(" ")[0];
            sNum = expression.split(" ")[2];
            rNum = expression.split(" ")[4];
            oper = "+".equals(expression.split(" ")[1]) ? 1 : -1;
            
            if("X".equals(rNum)) unsolves.add(expression);

            for(int i=2; i<=9; i++) {
                if(numbers.indexOf(i) == -1) continue;
                
                try {
                    if("X".equals(rNum)) {
                        // 변환 가능한지 여부만 체크
                        Integer.parseInt(fNum, i);
                        Integer.parseInt(sNum, i);
                    } else if(Integer.parseInt(fNum, i) + Integer.parseInt(sNum, i) * oper
                       != Integer.parseInt(rNum, i)) throw new NumberFormatException();
                } catch (NumberFormatException e) {
                    numbers.remove(numbers.indexOf(i));
                }
            }
        }
        
        answer = new String[unsolves.size()];
        String result, nowVal;
        
        for(int i=0; i<unsolves.size(); i++) {
            result  = "";
            fNum    = unsolves.get(i).split(" ")[0];
            oper    = "+".equals(unsolves.get(i).split(" ")[1]) ? 1:-1;
            sNum    = unsolves.get(i).split(" ")[2];
            
            for(int n : numbers) {
                nowVal = Integer.toString(Integer.parseInt(fNum, n) + Integer.parseInt(sNum, n)*oper, n);
                
                if(!"".equals(result) && !nowVal.equals(result)) {
                    result = "?";
                    break;
                }
                
                result = nowVal;
            }
            
            answer[i] = unsolves.get(i).replace("X", result);
        }
        
        return answer;
    }
}