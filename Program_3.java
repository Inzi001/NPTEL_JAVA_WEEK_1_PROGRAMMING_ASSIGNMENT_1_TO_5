import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius= s.nextDouble();
        double perimeter;
        double area;
        if (radius<0)
        {
            System.out.println("Please enter non zero positive number");
        }
        else
        {
            perimeter = 2*Math.PI*radius;
            area = Math.PI*radius*radius;
            System.out.println(perimeter);
            System.out.print(area);
        }
    }
}
