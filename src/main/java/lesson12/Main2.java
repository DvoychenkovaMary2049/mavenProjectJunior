package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1980, 10, 2.7, "Золото");
        Coin coin2 = new Coin(1980, 10, 2.7, "Золото");
        Coin coin3 = new Coin(1960, 1, 2.3, "Серебро");
        Coin coin4 = new Coin(1940, 5, 2.2, "Медь");
        Coin coin5 = new Coin(1970, 10, 2.0, "Золото");

        LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        // 1 - for each (везде)
        for (Coin c : coins) {
            System.out.println(c);
        }
        // 2 - for (спользуется там, где есть индексы)

        // 3 - с помощью итератора (везде)

        for (Iterator<Coin> iter = coins.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

    }
}