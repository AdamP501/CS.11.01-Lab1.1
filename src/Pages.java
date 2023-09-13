import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int page = 100 - age;
        System.out.print(age + "-year olds should read atleast " + page + " pages before giving up on a book");
    }
}
