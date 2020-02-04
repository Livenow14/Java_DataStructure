package section1_class;

public class Code1 {
    public static void main(String[] args) {

        Person1 first = new Person1();      //person1은 하나의 타입이라 생각하면된다. likes int double
                                            //사용자 정의 타입이라한다.
        first.name = "John";                //first 라는 참조변수(프리미티브 타입이 아닌 모든변수)
        first.number = "01024833120";       // 가 그 객체의 주소를 참조하는거임. 실제 데이터는 객체에 들어감.

        System.out.println("Name: "+ first.name + ", Number: "+ first.number);

        Person1 [] members= new Person1[10];
        members[0]=first;
        members[1]= new Person1();
        members[1].name="David";
        members[1].number="28735483524534";

        System.out.println("Name: "+ members[1].name + ", Number: "+ members[1].number);
    }
}
