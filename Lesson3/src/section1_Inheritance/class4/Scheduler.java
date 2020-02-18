package section1_Inheritance.class4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scheduler {
   // private int capacity = 10;
    public ArrayList<Event> events = new ArrayList<>(); //ArrayList를 사용한다.
    // ArrayList와는 달리 Vector클래스는  synchronized됨, 다수의  tread가 충돌없이 Vector 객체를 엑세스 가능. 성능 저하로, 현재는 거의 안씀
    //public Event[] events = new Event[capacity];        //배열의 크기가 항상 저장되어야하나?
  //  public int n=0;
    private Scanner kb;
    public void processCommand(){
        kb= new Scanner(System.in);
        while(true){
            kb= new Scanner(System.in);
            System.out.print("$ ");
            String command=kb.next();
            if(command.equals("addevent")){
                String type = kb.next();
                if(type.equalsIgnoreCase("oneday"))
                    handleAddOneDayEvent();
                else if(type.equalsIgnoreCase("duration"))
                    handleAddDurationEvent();
                else if(type.equalsIgnoreCase("deadline"))
                    handleAddDeadlineEvent();
            }
            else if(command.equals("list")){
                handleList();
            }
            else if(command.equals("show")){
                handleShow();
            }
            else if(command.equals("sort")){
                Collections.sort(events);
            }
            else if(command.equals("exit")){
                break;

            }
        }
        kb.close();
    }

    private void handleShow() {
        String dateString = kb.next();
        MyDate theDate = parseDateString(dateString);

        for(Event ev : events){
            //test if events[i] is relevant to the date, then print it;
           if(ev.isRelevant(theDate))
                System.out.println(ev.toString());
        }
    }

    private void handleList() {
    //    for(int i=0; i<events.size(); i++)
        for(Event ev : events)          // enhanced for loop event에 저장되있는 각각의  ev 에 대해서 루프를 돌라
            System.out.println("    "+ ev.toString());
    }

    private void handleAddDeadlineEvent() {
    }

    private void handleAddDurationEvent() {
    }

    private void handleAddOneDayEvent() {
        System.out.print("  when: ");
        String dateString=kb.next();        //dateString ="2017/1/20"
        System.out.print("  title: ");
        String title=kb.next();

        MyDate date = parseDateString(dateString);
        OneDayEvent ev = new OneDayEvent(title, date);
        addEvent(ev);

    }

    private void addEvent(OneDayEvent ev) {
/*        if(n>=capacity)
            reallocate();*/

        //events[n++]=ev;
        events.add(ev);
    }

/*    private void reallocate() {
        Event[] tmp = new Event[capacity * 2];
        for(int i=0; i<n; i++)
            tmp[i]=events[i];
        events = tmp;
        capacity*=2;
    }*/

    private MyDate parseDateString(String dateString) {
        String [] tokens = dateString.split("/");

        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);
        MyDate d = new MyDate(year,month,day);


        return d;
    }

    public static void main(String[] args) {

/*        String str="012-3456-78-9-abc-def";
        String [] tokens=str.split("-");
        for(int i=0; i<tokens.length; i++)
        System.out.println(tokens[i]);*/
/*        String str="012.3456.78.9.abc.def";
        String [] tokens=str.split("\\.");  //regular expression
        for(int i=0; i<tokens.length; i++)
        System.out.println(tokens[i]);*/
/*       String str="012 3456 78 9 abc    def";
        String [] tokens=str.split("\\s");  //regular expression
        for(int i=0; i<tokens.length; i++)
        System.out.println(tokens[i]);*/


        Scheduler app = new Scheduler();
        app.processCommand();


    }
}
