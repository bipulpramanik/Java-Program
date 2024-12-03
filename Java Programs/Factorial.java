import java.util.*;
 class Factorial{
    public static void main(String args[]){
        int n;
        int i;
        int f=1;
       
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any number");
        n=sc.nextInt();
       
        for (i=1;i<=n;i++) {
            f*=i;
        }
        System.out.println("The factorial of given number is:"+f);
    }
}
