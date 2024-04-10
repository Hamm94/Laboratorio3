
package Domain;

/**
 *
 * @author USER
 */
public class Client {
    
    //atributos 
    private String id;
    private String name;
    private String phone;
    private String adress;

    public Client() {
    }

    public Client(String id, String name, String phone, String adress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String toString(){
        
        String result= "CLIENT INFORMATION"
                +"\n-----------------------------"
                +"\nId : "+this.getId()
                +"\nName : "+this.getName()
                +"\nPhone : "+this.getPhone()
                +"\nAdress : "+this.getAdress();
        
        return result;
    }
    
    
    
    
}
