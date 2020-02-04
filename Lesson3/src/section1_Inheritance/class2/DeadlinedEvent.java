package section1_Inheritance.class2;

public class DeadlinedEvent extends Event {
    public MyDate deadline;
    public DeadlinedEvent(String title, MyDate d){
        super(title);
        deadline=d;
    }

    public String toString(){

        return  title+", "+deadline.toString();
    }
}
