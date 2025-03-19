import java.util.Random;
import java.util.Scanner;

public class controlstatement {
    public static void main(String[] args) {
        //scanner getHeight = new scanner (system.in);
        //system.out.print("enter your height: ");
        //int height = getHeight.nextInt();

        //scanner getWeight = new scanner (system.in);
        //system.out.print("enter your Weight: ");
       // int Weight = getWegiht.nextInt();?

           // Scanner scanner = new Scanner(System.in);
            //System.out.print("Enter the value of a: ");
           // int a = scanner.nextInt();

            //Scanner scanner2 = new Scanner(System.in);
           // System.out.print("Enter the value of b: ");
           // int b = scanner.nextInt();

           // Scanner Scanner3 = new Scanner(System.in);
          //  System.out.print("Enter the value of c: ");
           // int c = scanner.nextInt();


        //System.out.printf("there are no real roots"); break;
        //case 1 :{
           // x1 = -g/
        }

    Random random = new Random();
    int count = 0;
    int min = 100;
    int max = 1;

    while (count < 10 ){
        int number = random.nextInt((max - min) + 1) + min;
        System.out.println("Generatrd number" + number);
        

    }
}
