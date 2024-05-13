
/* rotate a number  */
import java.util.*;

class PG8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to be rotated");
        int n = scn.nextInt();
        System.out.println("Enter the degree to be rotated");
        int d = scn.nextInt();
        int nod = String.valueOf(n).length();
        /* to remove repeatition */
        d = d % nod;
        /* to handle negative rotation */
        if (d < 0) {
            d = d + nod;
        }
        /* approach one */
        while (d > 0) {
            int td = n % 10;
            n = n / 10;
            n = n + td * (int) Math.pow(10, nod - 1);
            d--;
        }
        /* approach two */

        /*
         * int div = 1;
         * int mul = 1;
         * for (int i = 1; i <= nod; i++) {
         * if (i <= d) {
         * div = div * 10;
         * } else {
         * mul = mul * 10;
         * }
         * }
         * n = (n % div) * mul + (n / div);
         */

        System.out.println("" + n);
    }
}
