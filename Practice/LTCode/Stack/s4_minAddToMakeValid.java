// 921. Minimum Add to Make Parentheses Valid

package Stack;

import java.util.Stack;

public class s4_minAddToMakeValid {
     public int minAddToMakeValid(String str) {
        
        int count = 0;

        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            if(ch == '('){
                s.push(ch);
            }
            else{
                if(!s.empty()){
                    s.pop();
                }
                else{
                    count++;
                }
            }
        }

        while(!s.empty()){      //Input: "(()(" ahiya vadhela '(' mate count++ karvu pade
            count++;
            s.pop();
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}
