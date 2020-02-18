package section1_Inheritance.class4_2;

public abstract class Shape  implements Comparable{
    private String shapeName;
    public Shape(String name) {
        shapeName = name;
    }

    public abstract double computeArea();
    public abstract double computePerimeter();
    public int compareTo(Object o){
        double MyArea = computeArea();
        double yourArea = ((Shape)o).computeArea();
        if(MyArea < yourArea) return -1;
        else if(MyArea == yourArea) return 0;
        else return 1;
    }
}