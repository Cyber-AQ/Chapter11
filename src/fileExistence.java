import java.util.*;
import java.io.*;
public class fileExistence {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter file name...");
            String fileName = scan.nextLine();
            File file = new File(fileName);
            Scanner scanFile = new Scanner(file);
            System.out.println("FILE WAS FOUND!");

        /*
        }catch (Exception e) {
            System.out.println("FILE Error: " + e.getMessage());
        }
         */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FILE NOT FOUND!");
        }

        System.out.println("DONE SEARCHING FOR A FILE.");
    }
}
