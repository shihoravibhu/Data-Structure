// 292. Nim Game

public class m8_Nim_Game {

     public boolean canWinNim(int n) {

        // As Per Question jo apdi pase 4 na multiple ma stones hoi to no matters how many stones are there apde loss karis j karn k game ni starting apda thi thai che so apde game tem kari ne apda friend pase 4 na multiple ma stones ave evu karvanu 

        // tuk ma jo apdi pase avela or rahela stone 4 na multiple ma hoi to apde win no thai sakiye 

        // jo apdi pase rahela stones 4 na multiple ma no hoi to apde win thasi 
      
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        
    }
}
