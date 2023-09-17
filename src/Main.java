import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>(5);
        ArrayList<String> b = new ArrayList<>(5);

        System.out.println("Введите 5 имён в A:");

        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextLine());
        }

        System.out.println("Введенные имена в А: " + a + "\n");
        System.out.println("Введите 5 имён в Б:");

        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());
        }

        System.out.println("Введенные имена в Б: " + b + "\n");

        ArrayList<String> c = new ArrayList<>(10);

        for (int i = 0; i < 5; i++) {
            c.add(a.get(i));
            c.add(b.get(4 - i));
        }

        System.out.println("Введённые имена в С перед сортировкой: " + c + "\n");
        c.sort(Comparator.comparing(String::length));
        System.out.println("Введённые имена в С после сортировки: " + c + "\n");
    }
}
