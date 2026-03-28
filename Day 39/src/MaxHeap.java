import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public MaxHeap(int[] items) {
        this();
        for (int item : items) {
            push(item);
        }
    }

    public void push(int value) {
        heap.add(value);
        floatUp(heap.size() - 1);
    }

    private void floatUp(int index) {
        if(index == 0) return; // root => stop

        int childInd = index;
        int parentInd = (childInd - 1) / 2;

        int child = heap.get(childInd);
        int parent = heap.get(parentInd);

        if(child > parent) {
            swap(parentInd, childInd);
            floatUp(parentInd);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
