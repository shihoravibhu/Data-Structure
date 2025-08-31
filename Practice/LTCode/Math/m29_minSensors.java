// 3648. Minimum Sensors to Cover Grid

public class m29_minSensors {
     public int minSensors(int n, int m, int k) {

        int cover = 2 * k + 1;

        int rows = (int) Math.ceil((double)n/cover);
        int colls = (int) Math.ceil((double)m/cover);

        return rows * colls;
    }
    public static void main(String[] args) {
        
    }
}
