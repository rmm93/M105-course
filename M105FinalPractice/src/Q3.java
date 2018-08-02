import java.util.*;
public class Q3 {
    public static void main(String[] args){
    System.out.println("Enter your words (enter finish to stop)");
    String word="";
    int count=1, c=1;
        while (!(word.equals("finish"))){
        Scanner inp = new Scanner(System.in);
        word= inp.next();
        System.out.println();
            if (word.length()==3){
            count ++;
            }//if
        c++;    
        }//while
    double percent = (double) count/c*100;
    System.out.printf("%.1f",percent);
    }//main
}//class
