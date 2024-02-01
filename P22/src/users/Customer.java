package users;

public class Customer {
    String name;
    long contact;
    String history;   
    @Override
    public String toString(){
        return "Cust. Name: "+name+"\nContact: "+contact+"\nPurchase history:\n"+history+"--------";
    }
    public void addHistory(String h){
        history+=h+"\n";
        System.out.println(h+" added to the history");
    }
    public Customer(String name, long cont, String hist){
        this.name = name; this.contact = cont; this.history = hist+"\n";
        System.out.println("Customer object created successfully!!");
    }
}

