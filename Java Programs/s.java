// import java.lang.*;
import java.util.*;

class s{
    public static void main(String args[]) {
        double l,b;
        int ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        System.out.println("\t Find the area ,perimeter and diagonal of Rectangle \t");
        System.out.println("\t Area of Rectangle\t");
        System.out.println("\t Perimeter of rectangle\t");
        System.out.println("\t Diagonal of Rectangle\t");
        System.out.println("\t Exit\t");

        System.out.println("Enter the value of length and breadth=");
        l=sc.nextDouble();
        b=sc.nextDouble();
        switch(ch)
        {
            case 1: double area1 = l*b;
            System.out.println("\t Area of Rectangle="+area1);
            break;

            case 2: 
            double area2 = 2*(l+b);
            System.out.println("\t Perimeter of Rectangle="+area2);
            break;

            case 3: double area3 = Math.sqrt((l*l)+(b*b));
            System.out.println("\t Diagonal of Rectangle="+area3);
            break;

            case 4: 
            System.out.println("\t Exit");
            break;

            default:
             System.out.println("\t Invalid Choice");       
        }
    }
}