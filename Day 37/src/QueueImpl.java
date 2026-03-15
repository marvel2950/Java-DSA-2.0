public class QueueImpl {
    protected int[] arr;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public QueueImpl() {
        this(10);
    }

    public QueueImpl(int cap) {
        arr = new int[cap];
    }

    public void enqueue(int ele) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is already full!");
        }
        arr[rear] = ele;
        rear++;
        size++;
    }

    public int dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is already empty!");
        }
        int x = arr[front];
        front++;
        size--;
        return x;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is already empty!");
        }
        return arr[front];
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }
}
