package section1_Inheritance.class3;

public class Test {
    public int a=10;
    public double x=1.23;

        public String toString(){
            return a+ " " + x;
        }
        public boolean equals(Object other ){
            Test other2=(Test)other;               //type cating
            return a==other2.a && x==other2.x;
        }
    public static void main(String[] args) {
/*        Test test = new Test();
        Test test2 = new Test();
*//*        test2.a=5;
        test2.x=2.34;*//*
        System.out.println(test.toString());

        if(test2.equals(test))
            System.out.println("yes");
        else
            System.out.println("No");*/

        Object [] array = new Object[100];
        int a =20;
      //  Integer age = new Integer(a);   F    //wrapping 하지만 자바는 자동으로 ㅐ해준다.
        array[0]=a;                     //auto boxing
        //int b = age.intValue();
        int b= (Integer) array[0];      //unboxing
        System.out.println(b);

        String str ="1234";
        int d = Integer.parseInt(str);
        System.out.println(d);
    }
}
