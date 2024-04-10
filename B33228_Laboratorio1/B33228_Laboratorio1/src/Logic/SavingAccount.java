
package Logic;

import Domain.Client;

/**
 *
 * @author USER
 */
public class SavingAccount extends Account {

    //attributes
    private String startDate;
    private int monthsNumber;
    private float interest;

    public SavingAccount(String startDate, int monthsNumber, float interest) {
        this.startDate = startDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public SavingAccount(String startDate, int monthsNumber, float interest,
            String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
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
        super.setBalance(getBalance() + amount);

    }

    @Override
    public void withdraw(double amount) {

        super.setBalance(interestCalculation() - amount);
    }

    @Override
    public double interestCalculation() {

        double interestTotal = 0;
        interestTotal = this.getMonthsNumber()
                * super.getBalance()
                * this.getInterest() / 100;

        return super.getBalance() + interestTotal;

    }

    public String toString() {

        String result = "\nACCOUNT TYPE: SAVING ACCOUNT"
                + "\n----------------------------"
                + "\nSavings Start Date: " + this.getStartDate()
                + "\nMonths: " + this.getMonthsNumber()
                + "\nInterest : " + this.getInterest() + "%"
                + "\nInterest you got: "
                + (this.getMonthsNumber()
                 *super.getBalance()
                * this.getInterest()
                / 100)
                + "\nStart Balance : " + getBalance()
                + "\nStart Date + Interest won: " + this.interestCalculation();

        return super.toString() + result;

    }

}
