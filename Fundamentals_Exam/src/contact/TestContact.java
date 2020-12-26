package contact;

public class TestContact {
    public static void main(String[] args) {

        Contact contact = new Contact("Mert Demirok", "mertdemirok@gmail.com", "0489994020", "016456776");
        System.out.println(contact);

        System.out.println("------------");
        contact.showInfo();

    }
}
