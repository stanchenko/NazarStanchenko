package lesson06.listing10list;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String>list = new ArrayList<>(); // лучше использовать если предусмотрена частая работа с элементами листа
        // Arraylist используется чаще
        //e1, e2, e3, e4
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        String s = list.get(0);
        System.out.println(s);
        System.out.println("");

        String a = list.toString();
        System.out.println(a);
        System.out.println("");

        boolean b = list.contains("five");
        System.out.println(b);
        System.out.println("");

        boolean c = list.isEmpty();
        System.out.println(c);

        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }


        System.out.println("");
        for(String d : list)
        {
            System.out.println(d);
        }


        List<String>list2 = new LinkedList<>(); //лучше использовать если данные постоянно добавляются и удаляются
        //e1, e2, e3, e4
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");



    }
}
