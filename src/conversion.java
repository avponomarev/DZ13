import java.util.Scanner;

public class conversion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}