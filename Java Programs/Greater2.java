import java.util.*;
class Greater{
    public static void main(String args[]){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of a & b");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println("A is Greatest");
        }
        else{
            System.out.println("B is Greatest");
        }
    }
}
