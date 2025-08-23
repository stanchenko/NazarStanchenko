package lesson06.listing14hashsetVslist;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пример 1");
        Set set = new HashSet();
        set.add("14"); // выводит один раз
        set.add("14");
        set.add("15");
        set.add("16");

        System.out.println(set);

        System.out.println("Пример 2");

        List list4 = new ArrayList();
        list4.add("13");
        list4.add("14");
        list4.add("14");
        list4.add("15");
        list4.add("16");
        System.out.println("List: "+list4);

        Set set2 = new HashSet();
        set2.add("13");
        set2.add("14");
        set2.add("14");
        set2.add("15");
        set2.add("16");

        System.out.println("Set: "+set2);

        System.out.println("Пример 3");

        Set list3 = new HashSet();
        list3.add("13");
        list3.add("14");
        list3.add("15");
        list3.add("16");
        list3.clear();
        System.out.println(list3);



    }
}
