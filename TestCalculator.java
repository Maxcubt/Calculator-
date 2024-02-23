import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.split("\\s+");

        if (parts.length != 3) {
            throw new Exception("throws Exception");
        }

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);

        if ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)) {
            throw new Exception("throws Exception.");
        }

        int result;
        switch (parts[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Результатом операции деления является целое число, остаток отбрасывается.
                result = num1 / num2;
                break;
            default:
                throw new Exception("throws Exception " + parts[1]);
        }

        return Integer.toString(result);
    }
}
