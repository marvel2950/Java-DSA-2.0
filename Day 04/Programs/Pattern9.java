public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("*\t");
                j++;
            }
            if (row < n) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            System.out.println();
            row++;
        }
    }
    
}
