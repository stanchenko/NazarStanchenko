package lesson06.listing11list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            ArrayList list = new ArrayList();
            list.add("13");
            list.add("14");
            list.add("15");
            list.add("16");
            list.add(1, "222");

            System.out.println(list);

            System.out.println("Изначальный размер листа " + list.size());

            list.remove(1);

            System.out.println("Размер листа стал = "+list.size()+ " т.к. удалили эл.с индексом 1");

            list.remove("16");
            System.out.println("Удалили элемент листа со значением 16 и размер листа стал = "+ list.size());


            for(Object l : list)
            {
                System.out.println(l);
            }

        System.out.println("Просмотрим оставшиеся элементы листа "+list);

    }
}
