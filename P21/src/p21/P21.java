package p21;

class BankAccount{
    float balance = 50000.00f;
    String holder = "Garv Saaxena";
    void withdraw(float amount){
        if(amount>balance){
            System.out.println("Withdraw not possible, insufficent balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw Successfully: "+amount+"\nCurrent balance: "+(balance+amount)+"\nFinal balance: "+balance);
        }
    }
}
class SavingsAccount extends BankAccount{
    int limit = 1;
    int tranc_number = 0;
    @Override
    void withdraw(float amount){
        if(tranc_number == limit){
            System.out.println("Withdraw not possible, limit reached");
        }
        else{
            super.balance-=amount;
            tranc_number+=1;
            System.out.println("Withdraw Successfully: "+amount+"\nCurrent balance: "+(super.balance+amount)+"\nFinal balance: "+super.balance);
        }
    }
}
class CheckingAccount extends BankAccount{
    int amount_limit = 1000;
    @Override
    void withdraw(float amount){
        if(amount > amount_limit){
            System.out.println("Withdraw amount exeeds limits");
        }
        else{
            super.balance-=amount;
            System.out.println("Withdraw Successfully: "+amount+"\nCurrent balance: "+(super.balance+amount)+"\nFinal balance: "+super.balance);
        }
    }  
}

public class P21 {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        BankAccount sbk = new SavingsAccount();
        BankAccount cbk = new CheckingAccount();
        System.out.println("Withdrawing from Main Account...");
        bk.withdraw(600000f);//withdrwaing more from balance
        bk.withdraw(50f);
        System.out.println("Withdrawing from Savings Account...");
        sbk.withdraw(50);
        sbk.withdraw(50);//Limited reached onlt 1 withdraw is allowed per month
        System.out.println("Withdrawing from Checking Account...");
        cbk.withdraw(1000);
        cbk.withdraw(2000);//Unlimited withdraw allowed but amount is limited to 1K
    } 
}