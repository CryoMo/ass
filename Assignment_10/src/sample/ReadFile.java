package sample;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    StringBuilder sb = new StringBuilder();
    public void Read() throws Exception{

        Scanner in = new Scanner("student_info.txt");
        in.useDelimiter(",");

        while (in.hasNext()){
            sb.append(in.nextLine());
            sb.append("\n");
        }
        in.close();
    }

}
