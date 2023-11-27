package TestTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException{
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "BibaSoft" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner scan = new Scanner(file);
        // while(scan.hasNextLine()){
        //     System.out.println(scan.nextLine());
        // }
        String input = scan.nextLine();
        String[] words = input.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for(String number : words){
            numbers.add(Integer.parseInt(number));
        }

        for(Integer numbering : numbers){
            System.out.print(numbering + ", ");
        }

        scan.close();

        
    }
}
