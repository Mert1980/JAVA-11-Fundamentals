package contact;

public class TestContact {
    public static void main(String[] args) {

        Contact contact = new Contact("Mert Demirok", "mertdemirok@gmail.com", "0289940520", "016456776");
        System.out.println(contact);

        System.out.println("------------");
        contact.showInfo();

    }
}
