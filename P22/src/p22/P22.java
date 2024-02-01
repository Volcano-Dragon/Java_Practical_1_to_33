package p22;
import inventory.InventoryManager;
import core.Book;
import users.Customer;
public class P22 {

    public static void main(String[] args) {
        System.out.println("Adding new book1...");
        InventoryManager Inma = new InventoryManager();
        Book book1 = Inma.addBook("NCERT Math1", "Nate", "56416181", 250.50f);
        Inma.infoBook(book1);
        System.out.println("Adding new book2...");
        Book book2 = Inma.addBook("NCERT Math2", "Watt", "56247351", 550.50f);
        Inma.infoBook(book2);
        System.out.println("Updating book1 price 250.50 to 255 and stock 50 to 55");
        Inma.alterBook(255, 55, book1);
        Inma.infoBook(book1);
        System.out.println("Creating cust1...");
        Customer cust1 = new Customer("Rahul S.",9549549548L,book1.getTitle()+" Purchased at price Rs."+book1.getPrice());
        System.out.println("Cust1 Details:");
        System.out.println(cust1);
        cust1.addHistory(book2.getTitle()+" Purchased at price Rs."+book2.getPrice());
        System.out.println("Cust1 Details update purchased:");
        System.out.println(cust1);
    }
    
}

