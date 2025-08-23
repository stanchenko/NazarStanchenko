package lesson06.listing17map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
// Map map2 = new LinkedHashMap();
// Map map3 = new TreeMap();
public class Main {
    public static void main(String[] args) {



        Map<String, Integer> map = new HashMap<>();
            map.put("Kiev", 27);
            map.put("Lviv", 14);
            map.put("Odessa", 17);
            map.put("Kharkiv", 19);

            System.out.println("Строчный вывод мапы: "+map);

            System.out.println("Вывод созданной мапы в формате ключ значение ");

            for(Map.Entry<String, Integer> m : map.entrySet() )
                System.out.println(m.getKey() +" "+ m.getValue());

            System.out.println("Получение значения по ключу Lviv = "+map.get("Lviv"));
          //  map.remove("Lviv"); удаление значения по ключу

          boolean a =  map.containsKey("Lviv");
          System.out.println("Проверка существования ключа  Lviv в мапе = "+a);

          boolean b = map.containsValue(20);
          System.out.println("Проверка существования значения 20 в мапе = "+b);


          System.out.println("Подсчет значений в мапе = "+map.size());
          System.out.println("Коллекция ключей в мапе = "+map.keySet());
          System.out.println("Коллекция значений в мапе = "+map.values());


    }
}
