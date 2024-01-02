//print the sum of n natural numbers
import java.util.Scanner;
public class recursion3AC {
    
    public static void printNumb(int i,int n,int sum){
//        sum +=i;
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printNumb(i+1,n,sum);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int i=1;
        printNumb(i,n,0);
        
        

    }
}
