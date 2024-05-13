import java.util.*;

class PG5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        int divisor = (int)Math.pow(10, nod-1);
        while(divisor!=0){
            System.out.println(n/divisor);
            n= n%divisor;
            divisor = divisor/10;
        }
    }
}
