
package Logic;

import Domain.Client;

/**
 *
 * @author USER
 */
public class CurrentAccount extends Account{
    
     private float interest;

    public CurrentAccount(float interest) {
        this.interest = interest;
    }

    public CurrentAccount(float interest, String accountNumber, double balance,
            Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    

    @Override
    public void deposit(double amount) {

       //super.setBalance(interestCalculation() + amount);
        super.setBalance(getBalance()+ amount);

    }

    @Override
    public void withdraw(double amount) {

        super.setBalance(interestCalculation() - amount);
    }

    @Override
    public double interestCalculation() {
       double interestTotal = 0;
        interestTotal = super.getBalance()
                        * this.getInterest()/12;

        return super.getBalance() + interestTotal;

    }
    
     public String toString(){
        
        String result="\nACCOUNT TYPE: CURRENT ACCOUNT"
                +"\n----------------------------"
                +"\nInterest : "+this.getInterest()+"%"
                +"\nInterest you got: "+
                (super.getBalance()
                *this.getInterest()
                /12
                )
                +"\nInterest won: "+this.interestCalculation();
        
        return super.toString()+result;
                
    
     }
    
}
