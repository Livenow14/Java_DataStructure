package section1_Inheritance.class4;

public class DeadlinedEvent extends Event {
    public MyDate deadline;
    public DeadlinedEvent(String title, MyDate d){
        super(title);
        deadline=d;
    }
    public boolean isRelevant(MyDate date){
        return deadline.compareTo(date)>=0;

    }

    public String toString(){

        return  title+", "+deadline.toString();
    }
}
