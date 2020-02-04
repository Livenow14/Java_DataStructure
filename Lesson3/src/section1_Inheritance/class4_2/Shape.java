package section1_Inheritance.class4_2;

public abstract class Shape {
    private String shapeName;
    public Shape(String name) {
        shapeName = name;
    }
    public abstract double computeArea();
    public abstract double computePerimeter();
}