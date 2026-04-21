import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stackChar = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (stackChar.empty()) {
                stackChar.push(current);
            } else if (stackChar.peek() == current) {
                stackChar.pop();
            } else {
                stackChar.push(current);
            }
        }
        if(stackChar.empty()){
            return 1;
        }else{
            return 0;
        }
    }
}