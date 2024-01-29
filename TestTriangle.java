import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The triangle is " + (triangle.isFilled() ? "" : "not ") + "filled");
        System.out.println("The color of the triangle is " + triangle.getColor());
    }

    static class Triangle extends GeometricObject {
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;

        public Triangle() {
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        @Override
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        }
    }
}
