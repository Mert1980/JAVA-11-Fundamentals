package be.intecbrussel.exercise_car_inheritance;

public class CarApp {
    public static void main(String[] args) {
        /*Car volvo = new SUV();
        System.out.println(volvo); // SUV{bullbar= false, speed= 0, hp= 190, color= white}

        volvo.accelerate(20);
        System.out.println(volvo); // SUV{bullbar= false, speed= 21, hp= 190, color= white}

        SUV toyota = new SUV();
        System.out.println(toyota); // SUV{bullbar= false, speed= 0, hp= 190, color= white}

        System.out.println(toyota.getSpeed()); // 0
        toyota.accelerate(56);
        System.out.println(toyota); // SUV{bullbar= false, speed= 57, hp= 190, color= white}

        toyota.slow(36);
        System.out.println(toyota.getSpeed()); // SUV{bullbar= false, speed= 20, hp= 190, color= white}

        toyota.AWDrive(true);
        toyota.accelerate(20);
        System.out.println(toyota); // SUV{bullbar= false, speed= 30, hp= 190, color= white}

        toyota.slow(20);
        System.out.println(toyota); // SUV{bullbar= false, speed= 9, hp= 190, color= white}

        toyota.accelerate(10);
        System.out.println(toyota); // SUV{bullbar= false, speed= 20, hp= 190, color= white}*/

        System.out.println();
        Car mercedes = new SUV("red", 300);
        Car porsche = new Cabrio("yellow", 200);
        Car tesla = new ElectricCar("green", 60);

        Car[] cars = {mercedes, porsche, tesla};
        printCars(cars);

        for (Car car:cars
             ) {
            car.accelerate(50);
        }
        printCars(cars);

        for (Car car:cars
        ) {
            car.park();
        }
        printCars(cars);

    }

    public static void printCars(Car[] cars){
        for (Car car:cars
             ) {
            System.out.println(car);
            System.out.println();
        }
    }
}
