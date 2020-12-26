package contact;

public class Contact {
    private ContactDetails details;
    private String name;

    public Contact(String name, String eMail, String gsm, String telephone) {
        this.name = name;
        this.details = new ContactDetails(eMail, gsm, telephone);
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println("GSM: " + details.getGsm());
        System.out.println("Phone: " + details.getTelephone());
        System.out.println("Email: " + details.geteMail());
    }

    @Override
    public String toString() {
        return name + '\n' + details;
    }
}
