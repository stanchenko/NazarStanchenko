package lesson06.listing18mapKeylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("Ukraine, EU");
        map.put("Kiev", list);
        System.out.println(map);

        System.out.println();

        Map<String, Map<String, String >> map2 = new HashMap<>();
        Map<String, String> value = new HashMap<>();
        value.put("Ukraine", "EU");
        map2.put("Kiev", value);
        System.out.println(map2);
    }
}
