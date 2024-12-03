import java.util.*;
class Greater3{
    public static void main(String args[]){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b & c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b) && (a>c)){
            System.out.println("A is Greatest");
        }
        else if((b>a) && (b>c)){
            System.out.println("B is Greatest");
        }
        else{
            System.out.println("C is Greatest");
        }
    }
}
