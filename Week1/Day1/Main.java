package Week1.Day1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle(3,4,5);

        assert approx(shape.area(), 7.0,1e-9);
        assert approx(shape.perimeter(),12,1e-9);
        System.out.println("All oops completed");

    }
    public static boolean approx(double a, double b, double eps){
        return Math.abs(a-b) <= eps;
    }
}
