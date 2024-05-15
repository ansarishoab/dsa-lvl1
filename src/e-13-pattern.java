import java.util.*;

class PG13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.print("\n");
        }
    }
}
