package homeworks.primitives;

import java.util.Scanner;

class Primitives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";
        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            char c = (char) Integer.parseInt(input, 8);
            output = output + c;
        }
        System.out.println("Результат: " + output);
    }
}