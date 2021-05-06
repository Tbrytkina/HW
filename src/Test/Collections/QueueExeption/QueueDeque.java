package Test.Collections.QueueExeption;

import java.util.PriorityQueue;

public class QueueDeque {
    public static void main(String[] args) {
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        myPriorityQueue.offer(33);

        System.out.println(myPriorityQueue.peek());
        System.out.println();

        for (int pq : myPriorityQueue) {
            System.out.println(pq);
        }
        myPriorityQueue.remove(2); // передается объект, НЕ ИНДЕКС!!!
        System.out.println("After removing");
        for (int pq : myPriorityQueue) {
            System.out.println(pq);
        }
    }
}
