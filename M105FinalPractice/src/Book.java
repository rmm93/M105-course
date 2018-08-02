public class Book {
    private String title;
    private double price;
    
    public Book(String t, double p){
        setTitle(t);
        setPrice(p);
    }//constructor
    public void setTitle(String t){
        title= t;
    }//setter
    public void setPrice(double p){
        price= p;
    }//setter
    public String getTitle(){
        return title;
    }//getter
    public double getPrice(){
        return price;
    }//getter
}
