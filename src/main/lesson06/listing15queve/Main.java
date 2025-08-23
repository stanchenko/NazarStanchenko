package lesson06.listing15queve;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue);

        System.out.println(" ");

        Queue queue1 = new PriorityQueue();
        queue1.add("one");
        queue1.add("two");
        queue1.add("three");
        queue1.add("four");
        queue1.add("five");
        queue1.add("six");
        System.out.println(queue1);
    }
}
