import java.util.Scanner;
class Swap {
    public static void main(String args[]) {
        int a;
        int b;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();
        temp = b;
        b = a;
        a = temp;
        System.out.println(" the value of a is :"+a);
        System.out.println(" the value of b is :"+b); 
    }
}
