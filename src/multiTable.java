import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the number of which you want the multiplication table: ");
        int num = scan.nextInt();  // Read user input

        System.out.println("Enter how long the table should be: ");
        int len = scan.nextInt();  // Read user input

        scan.close();

        int i = 1;
        while(i <= len)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }

    }
}
