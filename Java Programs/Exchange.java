import java.util.*;
class Exchange {
    public static void main(String args[]) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value num1 and num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1<num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        else{
            num1=num1*2;
            num2=num2*2;
        }
        System.out.println("After Processing");
        System.out.println("The value of num1 = "+num1);
        System.out.println("The value of num2 = "+num2);   
    }   
}
