package queue;

public interface Deque<E> extends Queue<E> {

    void insertLeft(E value);
    E removeLeft();
}
