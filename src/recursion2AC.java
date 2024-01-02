//print 5-1
public class recursion2AC {

  public static void printNumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNumb(n);

    }
}
