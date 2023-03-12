public class Contact {
    // write code here
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static String createContact(String name, String phoneNumber){
        return (name+" -> "+phoneNumber);
    }
}