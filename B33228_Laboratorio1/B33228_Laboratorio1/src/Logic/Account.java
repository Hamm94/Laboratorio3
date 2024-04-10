
package Logic;

import Domain.Client;

/**
 *
 * @author USER
 */
public abstract class Account {
    

    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    //---------------------------------------------
    //Methods in order to represent the polimorfism
    //---------------------------------------------
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation( ); 
    
    //Redefine toString
    
    public String toString(){
    
        String result= "\nBANK ACCOUNT INFORMATION"
                +"\n----------------------------------"
                +"\nAccount Number: "+this.getAccountNumber()
                +"\nBalance: "+this.getBalance()
                +"\nAccount Owner: "+this.getClient().toString();
        
        return result;
             
    
    }
    
    
    
    
}
