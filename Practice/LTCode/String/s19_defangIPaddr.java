// 1108. Defanging an IP Address

public class s19_defangIPaddr {
      public String defangIPaddr(String address) {
        
        StringBuilder sb = new StringBuilder();

        for(char ch : address.toCharArray()){
            if(ch == '.'){
                sb.append("[.]");
            }
            else{
            sb.append(ch);
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        
    }
}
