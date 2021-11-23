package lesson06.listing16queve;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("очередь до удаления " + queue);
        queue.remove();
        System.out.println("очередь после метода remove"+queue);

        System.out.println();


        Queue queue1 = new PriorityQueue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        System.out.println("Исходная очередь"+queue1);
        queue1.remove();
        System.out.println("результат после применения метода remove "+queue1);
        queue1.poll();
        System.out.println("результат после применения метода pool "+queue1);
        queue1.remove(4);
        System.out.println("результат после применения метода remove с индексом "+queue1);

        queue1.offer(6);
        System.out.println("результат после применения метода offer, добавления элемента "+queue1);

    }
}
