import java.util.*;
class AreaofTraingle{
    public static void main(String args[]) {
        int base;
        int height;
        int area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        base = sc.nextInt();
        height = sc.nextInt();
        area = (base*height)/2;
        System.out.println("Area of Traingle is : "+area);
    }
}