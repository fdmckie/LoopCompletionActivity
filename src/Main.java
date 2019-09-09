import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        System.out.println("Enter 10 integers:  ");
        for(int i = 1; i <= 10; i++) {
            System.out.println();
//            System.out.println("Enter an integer:  ");
            num = keyboard.nextInt();
            total += num;
        }
        // Loop should end here
        System.out.println();
        System.out.println("The total of all 10 numbers is " + total);


    }



}
