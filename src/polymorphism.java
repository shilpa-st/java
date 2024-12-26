
    class Employee {

        void work() {
            System.out.println("Employee is working");
        }
    }

    // Child class 1 - Manager
    class Manager extends Employee {
        @Override
        void work() {
            System.out.println("Manager is managing the team");
        }
    }

    // Child class 2 -Developer
    class Developer extends Employee {
        @Override
        void work() {
            System.out.println("Developer is writing code");
        }
    }

     class Polymorphism {
        public static void main(String[] args) {
            Employee employee1 = new Manager();
            employee1.work();

            Employee employee2 = new Developer();
            employee2.work();
        }
    }


