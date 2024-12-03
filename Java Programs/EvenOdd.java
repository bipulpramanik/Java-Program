import java.util.*;
class EvenOdd{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.err.println("Even Number");
        }
        else{
            System.err.println("Odd Number");
        }
    
    }
}
