
public class BookTest {
    public static void main(String[] args){
        Book textBook = new Book("Algorithms",7.5);
        textBook.setPrice(8.5);
        System.out.println(textBook.getTitle() + textBook.getPrice());
    }//main
}
