import java.util.*; 
public class javaa7 {    
    public static void printHelloWorld() {
        System.out.println("Helleo World");
        System.out.println("Helleo World");
        System.out.println("Helleo World");
    }

    public static int calculatesum(int num1 , int num2) { //paremeter of formal paremater
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a , int b) {
          //swap
          int temp = a;
          a = b;
          b = temp;


    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n ) {
        int f = 1;  

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        
        return f; //factorial of n  
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    //func to scalc sum of 2 nums
    // public static int sum(int a, int b ) {
    //     return a + b;
    // }

    // //func to calc sum of 3 nums
    // public static int sum(int a, int b, int c) {
    //     return a +b + c;
    // }

    //func to csl sum ofsum 
    public static int sum(int a, int b) {
        return  a+b;
    }
    //function to cal float sum 
    public static float sum(float a, float b) {
        return a+b;
    }
 
    //only for n>=2
    // public static boolean isPrime(int n) {
    //     //corner cases
    //     //1
    //     if(n == 2){
    //         return true;
    //     }

    //     boolean  isPrime  = true;
    //     for(int i=2; i<=n-1; i++) {
    //        if(n % i == 0) {//completely dividing
    //            isPrime = false;
    //            break;
    //         }
    //     }
    //     return isPrime;         
    // }

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
        
    public static void PrimesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { //true
                System.out.print(i+"");
            }
        }
        System.out.println();
    }



    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2, pow));
             
            pow++;
            binNum = binNum/10;

        }

        System.out.println("decimal of " + myNum  +" = " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }

        System.out.println("binary from of "  + myNum + " = "+ binNum);
    }

    // public static void print() {
    //     int s = 45;
    // }
    
    public static void main(String args[]) {
      for(int i =1; i<=5; i++) {


      }
      int  i=4;
      System.out.println(i);

    }
}    