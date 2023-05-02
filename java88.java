import java.util.*;

public class java88 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '_' : System.out.println(a-b);
                        break;
            case '*' :  System.out.println(a*b);
                        break;
            case '/' :  System.out.println(a/b); 
                        break;
            case '%' :  System.out.println(a%b);
                        break;
            defaut : System.out.println("wrong operator");                
        }

    }
}    