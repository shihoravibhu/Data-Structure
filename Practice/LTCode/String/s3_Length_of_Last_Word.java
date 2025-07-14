// 58. Length of Last Word

public class s3_Length_of_Last_Word{    

     public static int lengthOfLastWord(String s) {

         // s =s.trim();  // for this method O(n)

        // return s.length() - s.lastIndexOf(" ")-1;


        // or   (For This O(1))

        int i=s.length()-1;                 //last index thi chalu

        // while(i>=0 && s.charAt(i)==" "){     Not double quate for char must be remember    
        while(i>=0 && s.charAt(i)== ' '){  //trim vagar space ne skip kari      
            i--;                    
        }

        int len = 0;

        while(i>=0 && s.charAt(i) != ' '){   // length : last word   
            i--;
            len++;
        }

        return len;
    }
    public static void main(String[] args) {
        
        
        
        System.out.println(lengthOfLastWord("luffy is still joyboy heyy   "));
        
    }
}

