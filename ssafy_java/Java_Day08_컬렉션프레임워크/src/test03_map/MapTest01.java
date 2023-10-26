package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Map <키자료형, 값자료형> map
        Map<String, String> map = new HashMap<>();
        
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "3");
        
        System.out.println(map);
        
        map.put("A", "111");
        
        System.out.println(map);
        
        System.out.println(map.get("A"));
        System.out.println(map.get("E"));
        System.out.println(map.containsKey("C"));
        System.out.println(map.containsValue("4"));
        
        for (String key : map.keySet()) {
            System.out.printf("%s : %s", key, map.get(key));
        }
    }
}
