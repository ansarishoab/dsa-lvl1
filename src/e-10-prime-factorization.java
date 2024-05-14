import java.util.*;

class PG10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int factor = 2;
        while (n > 1) {
            while (n % factor == 0) {
                System.out.println(factor);
                n = n / factor;
            }
            factor++;
        }
    }
}
