// 2561. Rearranging Fruits (H)

package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class m1_minCost {
    public long minCost(int[] basket1, int[] basket2) {
        
        long cost = 0;
        Map<Integer, Integer> count = new HashMap<>();

        // diff total of each fruits
        for (int fruit_price : basket1) {
            count.put(fruit_price, count.getOrDefault(fruit_price, 0) + 1);
        }
        for (int fruit_price : basket2) {
            count.put(fruit_price, count.getOrDefault(fruit_price, 0) - 1);
        }

        // kai side ketla fruits send karvana chhe e store karse
        List<Integer> extras = new ArrayList<>();

        // vadharana fruits kya che ane ketla chhe e
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int fruit = entry.getKey();
            int diff = entry.getValue();

            if (diff % 2 != 0) {  // jo koi fruit odd time hoi to can't be balanced
                return -1;        // bey baskets ma same fruits thaij no sake
            }

            for (int i = 0; i < Math.abs(diff) / 2; i++) {
                extras.add(fruit);
            }
        }

        // cheapest first
        Collections.sort(extras);

        int minFruit = Math.min(
            Arrays.stream(basket1).min().getAsInt(),
            Arrays.stream(basket2).min().getAsInt()
        );

        int n = extras.size();

        // logic: extras ma suppose 4 fruits chhe, to total 2 wap thase  [1,2,3,4] : (1<->3)  (4<->2)
        // cost always minimum mate ganse,
        // to pela n/2 minimum matej count karvana chhe
        for (int i = 0; i < n / 2; i++) {
            cost += Math.min(extras.get(i), 2 * minFruit);
        }

        // have minimum cost kidhu chhe, to badhai fruits direct swap karva karta min fruit sathe swap karie 
        // cost = 3 for (5<->3)   
        // cost = 2 for (5<->1)(1<->3)  or (1<->3)(5<->1)

        return cost;
    }

    public static void main(String[] args) {
        
    }
}
