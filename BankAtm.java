import java.util.*;

class Account{
    // private properties
    private String accNo;
    private String accHolder;
    private long balance;
    
    // Create Account -> Constructor
    public Account(String accNo, String accHolder){
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = 0;
    }
    
    // public getters
    public String getAccNo(){
        return this.accNo;
    }
    
    public String getAccHolder(){
        return this.accHolder;
    }
    
    public long showBalance(){
        return this.balance;
    }
    
    // public setters
    public void setAccNo(String accNo){
        this.accNo = accNo;
    }
    
    public void setAccHolder(String accHolder){
        this.accHolder = accHolder;
    }
    
    public void depositMoney(long money){
        this.balance += money;
    }
    
    public void withdrawMoney(long money){
        if(money <= this.balance){
            this.balance -= money;
        } else {
            System.out.println("Insufficient Balance"); 
        }
    }
}

              //## night coder##//

public class BankAtm{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Account> database = new HashMap<>();
        // account number -> get all details of account
            
        while(true){
            String option = scn.next();
            
            if(option.equals("CREATE")){
                String accNo = scn.next();
                String accHolder = scn.next();
                
                // create a zero balance account
                Account acc = new Account(accNo, accHolder);
                // add it in the database
                database.put(accNo, acc);
                
            } else if(option.equals("DEPOSIT")){
                String accNo = scn.next();
                long money = scn.nextLong();
                
                // fetch data from your accNo
                Account acc = database.get(accNo);
                // depositing the money
                acc.depositMoney(money);
                
            } else if(option.equals("WITHDRAW")){
                String accNo = scn.next();
                long money = scn.nextLong();
                
                // fetch data from your accNo
                Account acc = database.get(accNo);
                // withdraw the amount required
                acc.withdrawMoney(money);
                
            } else if(option.equals("BALANCE")){
                String accNo = scn.next();
                
                // fetch the data from accNo
                Account acc = database.get(accNo);
                System.out.print(acc.getAccHolder() + " ");
                System.out.println(acc.showBalance());
                
            } else {
                break;
            }
        }
    }
}