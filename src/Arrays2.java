import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int numbers[]=new int[size];
        for (int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
        int max=numbers[0];
        for (int j=0;j<numbers.length;j++){
            if(numbers[j]>max){
                max=numbers[j];
            }
        }
        System.out.println(max);
        int min=numbers[0];
        for(int k=0;k<numbers.length;k++){
            if (numbers[k]<min){
                min=numbers[k];
            }
        }
        System.out.println(min);
}}
