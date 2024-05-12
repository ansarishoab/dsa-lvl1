import java.util.*;

class PG3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int last= 1;
        int sLast = 0;
        int ans=0;
        for(int i=0; i<n;i++){
            System.out.print("ans is :: "+ sLast+"\n");
            ans = last+sLast;
            sLast = last;
            last = ans;
        }
        
    }
}