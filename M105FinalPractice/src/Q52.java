import java.util.*;
public class Q52 {
    public static void even20(int max){
        while (max>=0){
            if (max %2 == 0){
                   System.out.println(max);
            }
            max--;
        }//for
    }//method
    public static void main(String[] args){
        System.out.print("Enter a positive integer");
        Scanner inp = new Scanner(System.in);
        int mx= inp.nextInt();
        System.out.printf("The even numbers from %d to 0: \n", mx);
        even20(mx);
    }//main
}//class

