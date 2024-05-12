import java.util.Scanner; // Import the Scanner class.

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object.
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("My String is: " + myString);
        System.out.println("My Integer is: " + myInt);
    }
}