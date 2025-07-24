// 1423. Maximum Points You Can Obtain from Cards

public class a36_maxScore {

    public int maxScore(int[] cardPoints, int k) {

        // 1️⃣ Take all k cards from the front initially (sum = cardPoints[0..k-1]).

        // 2️⃣ Now, one by one, remove cards from the end of the front, and add cards
        // from the back.

        // 3️⃣ Track the maximum sum during this process.

        int ans = 0, n = cardPoints.length;
        int max = 0;

        for (int i = 0; i < k; i++) {
            ans += cardPoints[i]; // front na badha k elment no sum
        }
        max = ans;

        for (int i = 0; i < k; i++) {
            ans = ans - cardPoints[k - 1 - i] + cardPoints[n - 1 - i]; // k-1th element thi remove karvanu chalu and n-1
                                                                       // thi element umervanu chalu then j last ma max
                                                                       // hase tene return
            max = Math.max(max, ans);
        }

        return max;

    }

    public static void main(String[] args) {

    }
}
