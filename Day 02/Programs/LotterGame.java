public class LotterGame {
    public static void main(String[] args) {
        int num = 79;
        if (num >= 15 && num <= 20) {
            System.out.println("Bike");
        } else if (num >= 50 && num <= 80) {
            System.out.println("Cycle");
        } else if (num >= 100 && num <= 200) {
            System.out.println("Car");
        } else if (num >= 250 && num <= 300) {
            System.out.println("Mac");
        } else if (num >= 1200 && num <= 1400) {
            System.out.println("Kurkure");
        } else {
            System.out.println("Haapy birthday!!!");
        }
    }

}