import java.util.*;

class PG10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        /* approach one */
        // int factor = 2;
        // while (n > 1) {
        // while (n % factor == 0) {
        // System.out.println(factor);
        // n = n / factor;
        // }
        // factor++;
        // }

        /* approach two */
        for (int div = 2; div < n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.println(div);
            }
        }
        if(n!=1){
            System.out.println(n);
        }

    }
}
