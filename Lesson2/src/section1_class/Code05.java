package section1_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

    static MyRectangle1[] rects=new MyRectangle1[100];
    static int n = 0;

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("./Lesson2/data.txt"));
            while (in.hasNext()) {
                rects[n]= new MyRectangle1();
                rects[n].lu.x = in.nextInt();
                rects[n].lu.y = in.nextInt();
                rects[n].width = in.nextInt();
                rects[n++].height = in.nextInt();
            }

        } catch (FileNotFoundException e) {
            System.out.println(" 파일이 없넹 ");
            System.exit(1);
        }
        bubbleSort();
        for(int i=0; i<n; i++)
            System.out.println(rects[i].lu.x +" "+rects[i].lu.y +" "+rects[i].width +" "+rects[i].height +" " );



    }

    private static void bubbleSort() {
        for(int i=n-1; i>0; i--){
            for(int k=0; k<i; k++){
                if(calc(rects[k])>calc(rects[k+1])){
                    MyRectangle1 tmp= rects[k];
                    rects[k]=rects[k+1];
                    rects[k+1]=tmp;

                }
            }
        }

    }
    public static int calc( MyRectangle1 r ){
        return r.width* r.height;
    }
}
