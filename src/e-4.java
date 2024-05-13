
/*Count digit of a number */
import java.util.*;

class PG4 {
    public static void main(String[] args) throws Error {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        while (n != 0) {
            n = n / 10;
            ans++;
        }
        System.out.println("total digits is: " + ans);
    }
}
