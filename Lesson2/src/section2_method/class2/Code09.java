package section2_method.class2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

    static MyRectangle2[] rects=new MyRectangle2[100];
    static int n = 0;

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("./Lesson2/data.txt"));
            while (in.hasNext())
                rects[n++]=  new MyRectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());

        } catch (FileNotFoundException e) {
            System.out.println(" 파일이 없넹 ");
            System.exit(1);
        }
        bubbleSort();
        for(int i=0; i<n; i++)
            System.out.println(rects[i].toString());
    }

    private static void bubbleSort() {
        for(int i=n-1; i>0; i--){
            for(int k=0; k<i; k++){
                if(rects[k].calc()>rects[k+1].calc()){
                    MyRectangle2 tmp= rects[k];
                    rects[k]=rects[k+1];
                    rects[k+1]=tmp;

                }
            }
        }

    }

}
