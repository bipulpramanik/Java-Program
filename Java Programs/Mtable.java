import java.util.*;
 class Mtable{
    public static void main(String args[]){
        int n;
        int i;
        int m;
       
       
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any number");
        n=sc.nextInt();
       
        for (i=1;i<=10;i++) {
          
        m=n*i;
        
        System.out.println("The Multiplication Table of given number is:"+n*i);
        }
    }
}