package Example;

public class PrintTotal {
    public void Print(AddNum[] addNum, int count){
        System.out.println("데이터 개수 "+  count );
        System.out.println("짝수의 합 " + addNum[0].sum );
        System.out.println("짝수의 개수 "+ addNum[0].count );
        System.out.println("홀수의 합 " + addNum[1].sum );
        System.out.println("홀수의 개수 "+ addNum[1].count );
    }

}
