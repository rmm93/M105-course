import java.util.Scanner;
public class Activities{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please insert the 1st Side");
    int side1= input.nextInt();
    System.out.println("Please insert the 2nd Side");
    int side2= input.nextInt();
    double pyth = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
    System.out.printf("The Pyth = %.2f", pyth);
    }
}