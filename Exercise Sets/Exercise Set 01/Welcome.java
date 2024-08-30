import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CS 221: Object-oriented Programming!");
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("This course will be fun, " +name+ "!");
        input.close();
    }
}