
import java.util.Scanner;
public class Circle1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please input a number");
        double rad= inp.nextDouble();
        double diamr = 2* rad;
        double circ = 2* Math.PI* rad;
        double area;
        area = (Math.PI)*(Math.PI)*rad;
        System.out.printf("Diameter is = %.2f\n", diamr);
        System.out.printf("Circumance is = %.2f\n", circ);
        System.out.printf("Area is = %.2f\n", area);

    }
}
