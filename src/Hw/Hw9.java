package Hw;

public interface Hw9 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code
     */
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Hw9{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        double area=3.14*(radius*radius);
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter=2*3.14*radius;
        return perimeter;
        }
    }
    class Square implements Hw9 {
        double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            double area = side * side;
            return area;
        }

        @Override
        public double calculatePerimeter() {
            double perimeter = 4 * side;
            return perimeter;
        }

        public static void main(String[] args) {
Circle circle=new Circle(7.0);
            System.out.println(circle.calculateArea());
            System.out.println(circle.calculatePerimeter());

            Square square=new Square(8.0);
            System.out.println(square.calculateArea());
            System.out.println(square.calculatePerimeter());
        }
    }


