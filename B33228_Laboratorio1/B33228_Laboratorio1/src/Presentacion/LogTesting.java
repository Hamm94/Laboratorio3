
package Presentacion;

import Domain.Client;
import Logic.CurrentAccount;
import Logic.Log;
import Logic.SavingAccount;

/**
 *
 * @author USER
 */
public class LogTesting {

    public LogTesting() {
    }
    
    public void test(){
        
        Client clients[]= new Client[10];
        Client client1= new Client("1-2222-9999","Joaquin","65893248","Colina");
        Client client2= new Client("1-2222-8888","Mario","87893248","Corales");
            Client client3= new Client("1-2222-7777","Carlos","87899523","Correa");
        
        clients[0]=client1;
        clients[1]=client2;
        clients[2]=client3;
        
        SavingAccount account1= new SavingAccount("2024-12-09",12,15,"104560",25250,client1);
        SavingAccount account2= new SavingAccount("2024-03-15",10,10,"109560",1000,client2);
        CurrentAccount account3= new CurrentAccount(15, "155855", 25000, client3);
                
        Log log[]= new Log[5];
        log[0]= new Log(1,"Saving Amounnt", account1,7000.0);
        log[1]= new Log(2,"Withdraw Amount", account2,7000);
        log[2]= new Log(3,"Saving Amount", account3,7000);
        
        for (int i = 0; i < log.length; i++) {
            if(log[i]!=null)
                System.out.println(log[i].toString());
            
        }
    
    }
    
}
