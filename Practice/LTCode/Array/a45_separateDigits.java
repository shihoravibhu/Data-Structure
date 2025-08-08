// 2553. Separate the Digits in an Array

import java.util.ArrayList;
import java.util.List;

public class a45_separateDigits {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            List<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10); // aiya je kai pan digits store thase te reverse ma thase because of num % 10 so 
                num = num / 10;
            }

            for (int i = temp.size() - 1; i >= 0; i--) { // reverse mathi pacha sidha karva mate 
                list.add(temp.get(i));
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
    public static void main(String[] args) {
        
    }
}
