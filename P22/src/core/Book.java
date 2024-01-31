package core;

public class Book {
    String title, author, ISBN;
    float price; int stock = 50;
    @Override
    public String toString(){
        return "Book title: "+title+"\nWritten by: "+author+"\nISBN: "+ISBN+"\nPrice: "+price;
    }
    public void updateBook(float price, int stock){
        this.price = price; this.stock = stock;
    }
    public Book(String title, String author, String ISBN, float price){
        this.title = title; this.author = author; this.ISBN = ISBN;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    
}
