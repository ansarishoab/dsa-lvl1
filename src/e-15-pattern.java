import java.util.*;

class PG15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print("");
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("\t");
            }
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
