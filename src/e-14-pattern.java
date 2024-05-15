import java.util.*;

class PG14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i > 0; i--) {
            int j = i;
            while (j > 0) {
                System.out.print("*\t");
                j--;
            }
            System.out.print("\n");
        }
    }
}
