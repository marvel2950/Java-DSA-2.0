import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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
        if (index == 0) return; // root => stop

        int childInd = index;
        int parentInd = (childInd - 1) / 2;

        int child = heap.get(childInd);
        int parent = heap.get(parentInd);

        if (child > parent) {
            swap(parentInd, childInd);
            floatUp(parentInd);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public Integer pop() {
        if (this.isEmpty()) return null;
        if (heap.size() == 1) return heap.remove(0);

        int max = heap.get(0);

        int lastInd = heap.size() - 1;
        swap(0, lastInd);
        heap.remove(lastInd);

//        heap.set(0, heap.remove(heap.size() - 1));

        bubbleDown(0);

        return max;
    }

    private void bubbleDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int largest = index;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (index != largest) {
            swap(index, largest);
            bubbleDown(largest);
        }
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }

    public static void main(String args[]) {

        // Heap Sort
        int[] arr = {5, 4, 3, 1, 88, 97, 99, 655};
        MaxHeap tempHeap = new MaxHeap(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = tempHeap.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap
        pq.add(6);
        pq.add(60);
        pq.add(62);
        pq.add(17);
        pq.add(901);
        System.out.println(pq.peek());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap
        pq2.add(6);
        pq2.add(60);
        pq2.add(62);
        pq2.add(17);
        pq2.add(901);
        System.out.println(pq2.peek());
    }
}
