package be.intecbrussel.exercise11_program_attributes;

public class TestApp {
    public static void main(String[] args) {
        ApplicationProperties appProps = new ApplicationProperties("Application.properties");
        appProps.setXPos(3);
        appProps.setYPos(5);
        appProps.setWidth(10);
        appProps.setHeight(15);

        appProps.store();
        appProps.load();
    }
}
