import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celsius value: ");
        double C = input.nextDouble();
        double F = C * 9 / 5 + 32;
        
        System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", C, F);
        input.close();
    }
}