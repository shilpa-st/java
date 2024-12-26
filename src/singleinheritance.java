
    class Vehicle {
        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    // Child class
    class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving...");
        }
    }

    class Demo {
        public static void main(String[] args) {
            // Create an object of the child class
            Car myCar = new Car();

            myCar.start();
            myCar.drive();
        }
    }

