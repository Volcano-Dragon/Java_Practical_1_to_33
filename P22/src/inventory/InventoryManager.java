package inventory;
import core.Book;
public class InventoryManager {
    public Book addBook(String title, String author, String ISBN, float price){
        return new Book(title, author, ISBN, price);
    }
    public void infoBook(Book book){
        System.out.println("Book Information: ");
        System.out.println(book);
    }
    public void alterBook(float price, int stock, Book book){
        book.updateBook(price, stock);
        System.out.println("Book updated!!"+"\nStock: "+book.getStock()+"   Price: "+book.getPrice());
    }
}
