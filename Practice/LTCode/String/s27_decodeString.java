// 394. Decode String

import java.util.Stack;

public class s27_decodeString {
    public static String decodeString(String str) {

        StringBuilder currstr = new StringBuilder();
        Stack<Integer> stackNum = new Stack<>(); 
        Stack<String> stackChar = new Stack<>();
        
        int n = 0;

     for(Character ch : str.toCharArray()){

        if(Character.isDigit(ch)){
            n = n * 10 + ch - '0';
        }
        else if(ch == '['){
            stackNum.push(n);
            stackChar.push(currstr.toString());
            currstr = new StringBuilder();
            n = 0;
        }
        else if(ch == ']'){
            StringBuilder sb2 = new StringBuilder(stackChar.pop());
            int repeat = stackNum.pop();

            for(int i=0 ; i<repeat ; i++){
                sb2.append(currstr);
            }
            currstr = sb2;
        }
        else{
            currstr.append(ch);
        }
     }

        return currstr.toString();
        
    }
    public static void main(String[] args) {

        System.out.println(decodeString("3[a]2[bc]"));
        
    }
}
