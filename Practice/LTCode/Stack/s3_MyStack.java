package Stack;

// 225. Implement Stack using Queues

import java.util.LinkedList;
import java.util.Queue;

public class s3_MyStack {
    class MyStack {

        public MyStack() {
            que = new LinkedList<>();
        }

        Queue<Integer> que;

        public void push(int x) {

            que.offer(x); // queue ma element last ma insert thai

            for (int i = 0; i < que.size() - 1; i++) {

                // have jo apde stack impliment karvu hoi to element ne fornt ma lai javo pade
                // so
                // for ex. Suppose queue = [1, 2], and we push(3):
                // Add 3 → queue becomes [1, 2, 3]
                // Rotate: poll 1 → offer 1, queue = [2, 3, 1]
                // Rotate: poll 2 → offer 2, queue = [3, 1, 2]

                que.offer(que.poll());
            }
        }

        public int pop() {
            return que.poll();
        }

        public int top() {
            return que.peek();

        }

        public boolean empty() {
            return que.isEmpty();

        }

    }

    public static void main(String[] args) {

    }
}
