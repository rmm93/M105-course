import java.util.*;
public class Q5 {
    public static void printSquares(int num){
        for (int i=1; i<=num;i++){
            System.out.println(Math.pow(i,2));
        }//for
    }//method
    
    public static void main(String[] args){
        System.out.print("Enter a positive integer");
        Scanner inp= new Scanner(System.in);
        int num= inp.nextInt();
        System.out.println("Squares are:");
        printSquares(num);
    }//main
}//class
