import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int last= 1;
        int sLast = 0;
        int ans=0;
        for(int i=3; i<=n;i++){
            ans = last+sLast;
            sLast = last;
            last = ans;
        }
        System.out.print("ans is :: "+ ans+"\n");
    }
}