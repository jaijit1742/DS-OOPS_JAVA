package Practice;

public class CmdCalculator {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        String op = args[1];
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        if (op.equals("+")) result = num1 + num2;
        else if (op.equals("-")) result = num1 - num2;
        else if (op.equals("*")) result = num1 * num2;
        else if (op.equals("/")) result = num1 / num2;
        else {
            System.out.println("Invalid operator! Use +, -, *, /");
            return;
        }

        System.out.println("Result: " + result);
    }
}
