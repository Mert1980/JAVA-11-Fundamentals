package contact;

public class TestContact {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("048990763", "Fixed");

        System.out.println(telephone.isValidNumber());
    }
}
