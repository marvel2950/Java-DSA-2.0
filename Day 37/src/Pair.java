public class Pair<K, V> {
    K x;
    V y;

    public Pair() {

    }

    public Pair(K x, V y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String args[]) {
        Pair<Integer, Float> p1 = new Pair<>(5, 2.2f);
        Pair<Integer, Float> p2 = new Pair<>();
        Pair<Integer, Boolean> p3 = new Pair<>();
    }
}
