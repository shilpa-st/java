
    // Parent class
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    class Test {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();
            dog.bark();
        }
    }

