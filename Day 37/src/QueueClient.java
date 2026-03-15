public class QueueClient {
    public static void main(String args[]) throws Exception {
        QueueImpl<Integer> q = new QueueImpl<>();
        q.enqueue(5);
        q.enqueue(50);
        q.enqueue(500);
        q.enqueue(5000);
        q.enqueue(50000);

        System.out.println(q.size());

        QueueImpl<Float> q2 = new QueueImpl<>();
        q2.enqueue(5.0f);
        q2.enqueue(50.0f);
        q2.enqueue(500.0f);

        System.out.println(q2.size());
    }
}
