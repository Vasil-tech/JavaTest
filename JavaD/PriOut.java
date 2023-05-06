package JavaD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PriOut {
    public static void main(String[] args) throws IOException{
        File file = new File("text.txt");
        if(!file.exists())
            file.createNewFile();

        PrintWriter print = new PrintWriter(file);
        print.println("analsex69");
        print.println("analsex69");
        print.print("cumDedPraded");
        print.close();

        BufferedReader BR = new BufferedReader(new FileReader("text.txt"));
        System.out.println(BR.readLine());
        System.out.println(BR.readLine());
        System.out.println(BR.readLine());
        BR.close();

        try{
            BufferedReader file2 = new BufferedReader(new FileReader("textik.txt"));
            System.out.println(file2.readLine());
        }
        catch(FileNotFoundException e){
            System.out.println("Ошибочка вышла " + e);
        }
    }
}


