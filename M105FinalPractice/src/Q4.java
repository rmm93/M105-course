public class Q4 {
    public static int veryGood(int[] a1){
        int count=0;
        for (int i=0; i<a1.length;i++){
            if (a1[i]>= 80 && a1[i]<90){
            count += 1;
            }//if
        }//for
        return count;
    }//method
    
    
}
