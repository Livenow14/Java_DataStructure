package section1_class;

public class Code1_2 {
    public static void main(String[] args) {

        Person1 first = new Person1();      //person1은 하나의 타입이라 생각하면된다. likes int double
                                            //사용자 정의 타입이라한다.
        first.name = "John";                //first 라는 참조변수(프리미티브 타입이 아닌 모든변수)
        first.number = "01024833120";       // 가 그 객체의 주소를 참조하는거임. 실제 데이터는 객체에 들어감.

        System.out.println("Name: "+ first.name + ", Number: "+ first.number);

        Person1 second = first ;
        second.name="Tom";
        System.out.println("Name: "+ first.name + ", Number: "+ first.number);

//        System.out.println("Name: "+ second.name + ", Number: "+ second.number);



        Person1 [] members= new Person1[10];
        members[0]= first;
        System.out.println("Name: "+ members[0].name + ", Number: "+ members[0].number);


        members[2]=new Person1();
        members[2].name="david";
        members[2].number="010101";
        System.out.println("Name: "+ members[2].name + ", Number: "+ members[2].number);


    }
}
