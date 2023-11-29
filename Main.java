import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("please input a number");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if(a <= 0) {
        System.out.println("invalid input. please input a positive whole number.");
    }
 StringBuilder result = new StringBuilder();
    for (int i = 0; i < a; i++) {
        char currentChar = (i % 2 == 0) ? '+':'-';
        result.append(currentChar);
    }

        System.out.println(a + " = " + result.toString());
    }
}