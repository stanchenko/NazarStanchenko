package lesson06.listing13hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Integer> heshSet = new HashSet<>();

        heshSet.add(1);
        heshSet.add(2);
        heshSet.add(3);

        for(int i : heshSet){
            System.out.println(i);
        }

    }
}
