package section1_Inheritance.class1;

class Notebook extends Computer {


    protected double screenSize;
    protected double weight;

    public Notebook(String man, String proc, int ram, int disk,
                    double procSpeed, double screen, double weight) {
        super(man, proc, ram, disk, procSpeed);
        screenSize = screen;
        this.weight = weight;
    }
    public double getScreenSize() {
        return screenSize;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        String result =super.toString() +"\nScreensize:"+ getScreenSize()+
                "\nWeight: "+ getWeight();
        return result;
    }

    public static void main(String[] args) {
    Computer test = new Notebook("Dekk", "15", 4, 10000,3.2,15.6,1.2 );

        System.out.println(test.computePower());
        System.out.println(test.toString());        //static binding vs. dynamic binding(자바에서는 항상 동적 바인딩이 일어난다.)

    }
}