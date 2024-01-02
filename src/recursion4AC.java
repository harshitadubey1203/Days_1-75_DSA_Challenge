//Print Factorial of a number n
//import java.util.Scanner;
//public class recursion4AC {
//    public static void printFact(int i,int n,int fact){
//        if(i==n){
//            fact*=i;
//            System.out.println(fact);
//            return;
//        }
//        fact*=i;
//        printFact(i+1,n,fact);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n=sc.nextInt();
//        int i=1;
//        printFact(i,n,1);
//    }
//}

//Alternative
import java.util.Scanner;
public class recursion4AC {
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calcfactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int ans=calcfactorial(n);
        System.out.println(ans);

    }
}

