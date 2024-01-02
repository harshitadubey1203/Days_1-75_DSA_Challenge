import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println(i);
            }

        }
    }
}

