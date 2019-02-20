package queue;

public class QueueMain {
    public static void main(String[] args) {
        //Queue<Integer> queue = new QueueImpl<>(5);
        //Queue<Integer> queue = new PriorityQueue<>(5);
        Deque<Integer> queue = new DequeImpl<>(5);

        insert(queue, 3);
        insert(queue, 2);
        insert(queue, 4);
        insert(queue, 5);
        insert(queue, 1);
        insert(queue, 222);


        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove top: " + remove(queue));
        System.out.println("Remove top: " + remove(queue));
        System.out.println("Remove bot: " + removeLeft(queue));


        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

        insertLeft(queue, 22);
        insertLeft(queue, 11);
        insert(queue, 10);


        while ( !queue.isEmpty()) {
            System.out.println(remove(queue));
        }
    }

    private static <E> E remove(Queue<E> queue) {
        if ( !queue.isEmpty()){
            return queue.remove();
        }
        return null;
    }

    private static <E> void insert(Queue<E> queue, E value) {
        if ( !queue.isFull()){
            queue.insert(value);
        }
    }

    private static <E> void insertLeft(Deque<E> queue, E value) {
        if ( !queue.isFull()){
            queue.insertLeft(value);
        }
    }

    private static <E> E removeLeft(Deque<E> queue) {
        if ( !queue.isEmpty()){
            return queue.removeLeft();
        }
        return null;
    }



}
