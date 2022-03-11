import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.next();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println(name + " you can enter to the club");
        } else {
            System.out.println(name + " you can't enter to the club");
        }
    }
}
