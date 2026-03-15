import java.util.ArrayList;
import java.util.List;

public class QueueImpl <K> {
    protected List<K> arr;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public QueueImpl() {
        this(10);
    }

    public QueueImpl(int cap) {
        arr = new ArrayList<>();
    }

    public void enqueue(K ele) {
        arr.add(ele);
        size++;
    }

    public K dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is already empty!");
        }
        K x = arr.remove(0);
        front++;
        size--;
        return x;
    }

    public K peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is already empty!");
        }
        return arr.get(0);
    }

    public boolean isFull() {
        return size() == arr.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }
}
