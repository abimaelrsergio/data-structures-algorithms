package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        //myQueue.getFirst();
        //myQueue.getLast();
        //myQueue.getLength();

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println("Dequeue: " + myQueue.dequeue().value);

        myQueue.printQueue();
    }
}
