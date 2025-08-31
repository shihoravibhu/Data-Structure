// 17. Letter Combinations of a Phone Number

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class b1_letterCombinations {
     public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

         if (digits == null || digits.length() == 0) {
            return res;
        }

        res.add("");    // start with empty string

        String[] str = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

        for(char digit : digits.toCharArray()){
            List<String> list = new ArrayList<>();

            String letters = str[digit - '0'];

            for(String prefix : res){
                for(char ch : letters.toCharArray()){

                    list.add(prefix + ch);

                }
            }

            res = list;     // update

        }

      return res;
        
    }


// or (By BackTracking)

// import java.util.*;

// class Solution {
//     private static final String[] str = {
//         "",     // 0
//         "",     // 1
//         "abc",  // 2
//         "def",  // 3
//         "ghi",  // 4
//         "jkl",  // 5
//         "mno",  // 6
//         "pqrs", // 7
//         "tuv",  // 8
//         "wxyz"  // 9
//     };

//     public List<String> letterCombinations(String digits) {
//         List<String> res = new ArrayList<>();
//         if (digits == null || digits.length() == 0) {
//             return res;
//         }
//         backtrack(res, new StringBuilder(), digits, 0);
//         return res;
//     }

//     private void backtrack(List<String> res, StringBuilder current, String digits, int index) {
//         if (index == digits.length()) {
//             res.add(current.toString());
//             return;
//         }

//         String letters = str[digits.charAt(index) - '0'];
//         for (char ch : letters.toCharArray()) {
//             current.append(ch);
//             backtrack(res, current, digits, index + 1);
//             current.deleteCharAt(current.length() - 1); // backtrack
//         }
//     }
// }
    public static void main(String[] args) {
        
    }
}

