package lesson14;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(433, "Петр Петров");
        map.put(null, null);

        System.out.println(map);
    }
}
