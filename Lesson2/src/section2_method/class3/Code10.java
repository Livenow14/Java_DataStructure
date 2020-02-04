package section2_method.class3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("./Lesson2/data2.txt"));
            int n = in.nextInt();
            OrthorPolygon thePolygon = new OrthorPolygon(n);
            for(int i=0; i<n; i++)
                thePolygon.addVertex(in.nextInt(),in.nextInt());

            MyPoint3 thePoint = new MyPoint3(in.nextInt(), in.nextInt());
            in.close();

            if(thePolygon.contains(thePoint))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        catch (FileNotFoundException e ){
            System.out.println("No data file exists.");
            System.exit(1);

        }
    }
}
