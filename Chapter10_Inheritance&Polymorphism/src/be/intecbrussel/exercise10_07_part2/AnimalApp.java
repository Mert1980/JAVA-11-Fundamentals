package be.intecbrussel.exercise10_07_part2;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Pretty");
        Animal fish = new Fish("");
        Bird bird = new Bird("EagleEye");
        Animal snake = new Snake("danger");

        System.out.println(cat.getName());
        cat.move();
        cat.makeNoise();
        System.out.println(fish.getName());
        fish.move();
        fish.makeNoise();
        System.out.println(bird.getName());
        bird.move();
    }
}
