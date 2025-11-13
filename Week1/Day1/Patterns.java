package Week1.Day1;

public class Patterns {
}
class Car {
    String brand;
    String model;
    String color;
    int year;
    boolean electric;
    boolean sunroof;

    Car(ClassBuilder builder){
        this.brand = builder.brand;
    }
}
class ClassBuilder{
    String brand;
    String model;
    String color;
    int year;
    boolean electric;
    boolean sunroof;

    public ClassBuilder brand(String val){
        brand = val;
        return this;
    }
    public ClassBuilder model(String val){
        model = val;
        return this;
    }
    public ClassBuilder color (String val){
        color = val;
        return this;
    }
    public ClassBuilder year(int val){
        year = val;
        return this;
    }
    public Car build(){
        return new Car(this);
    }
}


