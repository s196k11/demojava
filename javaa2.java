import java.util.*;

public class javaa2{
    public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();                                                  

           boolean isprime = true;
           for(int i = 2; i<=n-1; i++) {
            if(n % i ==0){
                isprime = false;
            }
        }
        
        if(isprime == true) {
            System.out.println("n is prime");
        } else{
            System.out.println("n i not primr");
        }
    }
}    