package section1_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
    static Person1 [] members = new Person1[100];
    static int n = 0;
    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("./Lesson2/input.txt"));
            while(inFile.hasNext()){
                String nm= inFile.next();
                String number= inFile.next();

                members[n] = new Person1();
                members[n].name= nm;
                members[n].number = number;
                n++;

            }
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("no data file");
        }

        for(int i=0; i<n; i++)
            System.out.println(members[i].name + " " + members[i].number);
    }
}
