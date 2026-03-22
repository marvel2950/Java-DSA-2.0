public class Cars {
    int price;
    int speed;
    String color;

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    public Cars(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
}
