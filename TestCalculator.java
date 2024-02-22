import java.util.Scanner;

class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Output:");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }

    static String calc(String input) throws Exception {
        String[] tokens = input.split(" ");

        if (tokens.length != 3) {
            throw new Exception();
        }

        int a, b;

        try {
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new Exception();
        }

        char operator = tokens[1].charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new Exception();
                }
                result = a / b;
                break;
            default:
                throw new Exception();
        }

        return String.valueOf(result);
    }
}














