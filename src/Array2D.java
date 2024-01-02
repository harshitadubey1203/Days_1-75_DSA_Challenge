import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int numbers[][]=new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("Enter the number you want to search:");
        int x= sc.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (numbers[i][j]==x){
                    System.out.println("The number u want to search is at index"+(i+1)+""+(j+1));

                }
            }
        }
    }
}
