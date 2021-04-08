package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    long id;
    Double testGrade2;
    String text;
    Double num1;
    //ArrayList<Double> grade = new ArrayList<Double>(num1, num2 );
    Double[] grade1 = [num1, testGrade2];
    public Student(){
        try {
            Scanner in = new Scanner("student_info.txt");
            in.useDelimiter("[,\n]");

            while (in.hasNext()){
                this.id = Integer.valueOf(in.next());
                this.age = Integer.valueOf(in.next());
                this.fistName = in.next();
                this.lastName = in.next();
                this.num1 = Double.valueOf(in.next());
                this.testGrade2 = Double.valueOf(in.next());
                this.name = fistName + " " + lastName;
        }
            in.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        this.text="Name= " + name + ", ID = " + id + ", Grades ["  + grade.get(0) + "].\n";
    }
    @Override
    public String toString() {
        return  "Name= " + name + "ID = " + id + ", Grades [" + grade.get(0)+ ", " + grade.get(1) + "].";
    }



}
