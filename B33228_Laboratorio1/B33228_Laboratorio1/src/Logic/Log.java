
package Logic;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Log {
    
    private int eventId;
    private String evenet;
    private Date date;
    private Account account;
    private double movement;
    
    private static int consecutive=0;

    public Log() {
        this.eventId = ++consecutive;
        
    }

    public Log(int eventId, String evenet,  Account account, double movement) {
       
        this();//Call to the constructor
        this.eventId = eventId;
        this.evenet = evenet;
        this.date = new java.util.Date();
        this.account = account;
        this.movement = movement;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvenet() {
        return evenet;
    }

    public void setEvenet(String evenet) {
        this.evenet = evenet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Log.consecutive = consecutive;
    }
    
    
    public String toString(){
        
        String result= "\nBANK LOG INFORMATION"
                +"\n-------------------------------"
                +"\nEvent Id: "+this.getEventId()
                +"\nEvent Type: "+this.getEvenet()
                +"\nTransaction Date: "+this.getDate()
                +"\nMovement Account: "+this.getMovement()
                +"\nAffected Account: "+this.getAccount().toString();
                
    
        return result;
    }
    
    
}
