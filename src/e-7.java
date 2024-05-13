/* Inverse a number */
import java.util.*;

class PG7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int position= 0;
        int ans = 0;
        while(n!=0){
            int digit = n%10;
            position++;
            ans = ans+ position*((int)Math.pow(10,digit-1));
            n= n/10;
        }
        System.out.print(ans);
    }
}
