package Example;
import java.util.Scanner;

public class Total_While {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        AddNum [] addNum = new AddNum[2];
        PrintTotal print = new PrintTotal();
        addNum[0]= new AddNum();
        addNum[1]= new AddNum();
        int count=0;
        while(true){
            System.out.print("정수입력 : ");
            int su = kb.nextInt();
            if(su==-1)
                break;
            addNum[su%2].count++;
            addNum[su%2].sum+=su;
            count++;

        }
            print.Print(addNum, count);
    }
}
