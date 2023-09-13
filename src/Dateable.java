import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int age2 = (age/2) + 7;
        System.out.print(age + "-year olds should date someone that is atleast " + age2 + " years old.");

    }
}
