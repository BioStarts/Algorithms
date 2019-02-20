package queue;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public static final int DEFAULT_FRONT_LEFT = 4;
    public static final int DEFAULT_REAR_LEFT = 5;//тут я задал константу, но это неправильно т.к. по факту это maxSize

    int frontLeft;
    int rearLeft;


    public DequeImpl(int maxSize) {
        super(maxSize);
        this.frontLeft = DEFAULT_FRONT_LEFT;
        this.rearLeft = DEFAULT_REAR_LEFT;
    }

    @Override
    public void insertLeft(E value) {
        if (rearLeft == 0){//тут вопрос 0 или 1 все-таки вставляем реарлэфт
            rearLeft = DEFAULT_REAR_LEFT;
        }
        data[--rearLeft] = value;
        size++;
    }

    @Override
    public E removeLeft() {
        E value = data[frontLeft--];
        if (frontLeft == 0){
            frontLeft = DEFAULT_FRONT_LEFT;
        }

        size--;
        return value;
    }
}
