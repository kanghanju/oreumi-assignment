package weeklyquiz.week4;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                stk.push('(');
            }else {
                if(stk.size() == 0) {//pop하려는데 스택에 괄호가 없으면 return false;
                    return false;
                }
                stk.pop();
            }
        }

        if(stk.size() != 0) return false;

        return true;
    }
}