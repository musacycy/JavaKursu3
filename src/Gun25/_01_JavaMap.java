package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Sets: Hashset,LinkedHashSet,TreeSet
        //Maps: HashMap,LinkedHashMap,TreeMap
        Map<Integer, Integer> m = new HashMap<>();//Key ve Valuesi Integer olan bir map
        m.put(2, 11);//2 keyine 11 atandı
        m.put(3, 12);
        m.put(6, 15);
        m.put(2, 5);//2 anahtarında değeri güncellendi
        System.out.println("m = " + m);
        System.out.println("m.get(2) = " + m.get(2));
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        for (Integer k : m.keySet())
            System.out.println("k = " + k);
        for (Integer v : m.values())
            System.out.println("v = " + v);

        for (Map.Entry<Integer, Integer> keyValue : m.entrySet()) {
            System.out.println("keyValue.getKey() = " + keyValue.getKey());
            System.out.println("keyValue.getValue() = " + keyValue.getValue());

        }
        System.out.println("m.containsKey(2) = " + m.containsKey(2));
        System.out.println("m.containsValue(15) = " + m.containsValue(15));
        m.remove(2);
        System.out.println("m = " + m);
        System.out.println("m.keySet() = " + m.keySet().size());
        m.clear();
        System.out.println("m = " + m);
    }
}
