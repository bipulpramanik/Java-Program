// import java.lang.*;
import java.util.*;

class s{
    public static void main(String args[]) {
        double l,b;
        int ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        System.out.println("\tArea Menu\t");
        System.out.println("\tArea of Rectangle\t");
        System.out.println("\tPerimeter of rectangle\t");
        System.out.println("\t Diagonal of Rectangle\t");
        System.out.println("\tExit\t");

        System.out.println("Enter the value of length and breadth=");
        l=sc.nextDouble();
        b=sc.nextDouble();
        switch(ch)
        {
            case 1: double area1 = l*b;
            System.out.println("\tArea of Rectangle="+area1);
            break;

            case 2: 
            double area2 = 2*(l+b);
            System.out.println("\tPerimeter of Rectangle="+area2);
            break;

            case 3: double area3 = Math.sqrt((l*l)+(b*b));
            System.out.println("\tDiagonal of Rectangle="+area3);
            break;

            case 4: 
            System.out.println("\tExit");
            break;

            default:
             System.out.println("\tInvalid Choice");       
        }
    }
}