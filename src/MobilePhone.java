import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        Contact con = new Contact();
    }
    public boolean addNewContact(Contact contact){
        if (myContacts.contains(contact)){
            return true;
        }else {
            return false;
        }
    }
    public boolean updateContact(Contact old, Contact edit){
        if (myContacts.contains(old)){
            int i = myContacts.indexOf(old);
            myContacts.set(i,edit);
            return true;
        }else {
            return false;
        }
    }
    public boolean removeContact(Contact edit){
        if (myContacts.contains(edit)){
            myContacts.remove(edit);
            return true;
        }else {
            return false;
        }
    }
    public int findContact(Contact edit){
        int i = myContacts.indexOf(edit);
        return i;
    }
    public int findContact(String edit){
        int i = myContacts.indexOf(edit);
        return i;
    }
    public Contact queryContact(String edit){
        if (myContacts.contains(edit)){
            int i = myContacts.indexOf(edit);
            return myContacts.get(i);
        }else {
            return null;
        }
    }
    public void printContacts(){
        for (int i = 0; i<myContacts.size(); i++){
            System.out.println(myContacts.get(i));
        }
    }
}
