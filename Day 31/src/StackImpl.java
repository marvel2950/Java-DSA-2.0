public class StackImpl {
    protected int[] arr;
    private int top = -1;

    public StackImpl() {
        this(10);
    }

    public StackImpl(int cap) {
        arr = new int[cap];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int a) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is already full !");
        }
        top++;
        arr[top] = a;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty !");
        }
        return arr[top];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty !");
        }
        int ele = arr[top];
        top--;
        return ele;
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public int size() {
        return top + 1;
    }
}
