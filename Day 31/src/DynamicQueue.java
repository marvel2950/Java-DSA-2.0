import java.util.ArrayList;

public class DynamicQueue extends QueueImpl {
    @Override
    public void enqueue(int ele) throws Exception {
        if(isFull()) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        super.enqueue(ele);
    }
}
