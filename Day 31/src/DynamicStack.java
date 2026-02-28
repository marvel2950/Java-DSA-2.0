//import Day 28.StackImpl;

public class DynamicStack extends StackImpl {
    @Override
    public void push(int a) throws Exception {
        if (isFull()) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        super.push(a);
    }
}
