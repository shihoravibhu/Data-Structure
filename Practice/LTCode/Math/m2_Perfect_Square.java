// 367. Valid Perfect Square

public class m2_Perfect_Square {

      public int sq(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int s = 1;
        int e = n / 2;;
        int mid = -1;

        while (s <= e) {

            mid = s + (e - s) / 2;
            long square =(long) mid * mid;

            if (square == n) {
                return mid; // Found perfect square root
            } else if (square > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return e;

    }

    public boolean isPerfectSquare(int num) {

        int sqrt = sq(num);

        return (long) sqrt * sqrt == num;

    }
    public static void main(String[] args) {
        
    }
}
