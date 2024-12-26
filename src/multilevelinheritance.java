
    class Shape {
        void draw() {
            System.out.println("Drawing a shape...");
        }
    }

    // Parent class
    class Rectangle extends Shape {
        void area() {
            System.out.println("Area = length × breadth");
        }
    }

    // Child class
    class ColoredRectangle extends Rectangle {
        void color() {
            System.out.println("The rectangle is blue.");
        }
    }

    class MainClass1 {
        public static void main(String[] args) {
            // Create an object of the child class
            ColoredRectangle coloredRect = new ColoredRectangle();

            coloredRect.draw();
            coloredRect.area();
            coloredRect.color();
        }
    }

