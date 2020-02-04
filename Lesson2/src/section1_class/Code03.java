package section1_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {
    static Person1 [] members = new Person1[100];
    static int n = 0;
    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("./Lesson2/input.txt"));
            while(inFile.hasNext()){
                String nm= inFile.next();
                String number= inFile.next();

                members[n]=new Person1();
                members[n].name= nm;
                members[n].number = number;
                n++;

            }
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("no data file");
        }

            bubbleSort();

        for(int i=0; i<n; i++)
            System.out.println(members[i].name + " " + members[i].number);
    }
    private static void bubbleSort(){
        for(int i=n-1; i>0; i--){
            for(int k=0; k<i; k++){
                if( members[k].name.compareTo(members[k+1].name)>0 ) {
                    Person1 tmp = members[k];
                    members[k]=members[k+1];
                    members[k+1]=tmp;
                }
            }
        }
    }
}
