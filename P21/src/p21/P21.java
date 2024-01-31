package p21;

class BankAccount{
    float balance = 2500.25f;
    String holder = "Garv Saaxena";
    void withdraw(float amount){
        if(amount>balance){
            System.out.println("Withdraw not possible, insufficent balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw Successfully,\nCurrent balance: "+(balance+amount)+"\nFinal balance: "+balance);
        }
    }
}
class SavingsAccount extends BankAccount{
    int limit = 5;
    int tranc_number;
    @Override
    void withdraw(float amount){
        if(tranc_number == limit){
            System.out.println("Withdraw not possible, limit reached");
        }
        else{
            super.balance-=amount;
            System.out.println("Withdraw Successfully,\nCurrent balance: "+(super.balance+amount)+"\nFinal balance: "+super.balance);
        }
    }
}
class CheckingAccount extends BankAccount{
    int amount_limit;
    @Override
    void withdraw(float amount){
        if(amount > amount_limit){
            System.out.println("Withdraw amount exeeds limits");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw Successfully...\nCurrent balance: "+(super.balance+amount)+"\nFinal balance: "+super.balance);
        }
    }  
}

public class P21 {
    public static void main(String[] args) {
        
        
    } 
}
