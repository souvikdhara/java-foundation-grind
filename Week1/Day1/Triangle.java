package Week1.Day1;

public class Triangle implements Shape{
    private final double a,b,c;
    Triangle(double a, double b, double c){
        if(!isValid(a,b,c)) throw new IllegalArgumentException("Triangle sides are not valid");
        this.a =a;
        this.b=b;
        this.c=c;
    }
    private static boolean isValid(double a, double b, double c){
        if(a<0 || b<0 || c<0) return false;
        if(Double.isNaN(a+b+c) || Double.isInfinite(a+b+c)) return false;
        return a+b>c && b+c>a && c+a>b;
    }
    @Override
    public double area() {
        double s =(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle ("+a+", "+b+", "+c+")";
    }
}
