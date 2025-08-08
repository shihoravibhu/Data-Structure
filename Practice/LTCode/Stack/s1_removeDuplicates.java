package Stack;

// 1047. Remove All Adjacent Duplicates In String

import java.util.Stack;

public class s1_removeDuplicates {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch); // add current character
            } else {
                stack.pop(); // remove duplicate
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
