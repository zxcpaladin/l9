package lr10.DecimalToBinary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryRepresentation = convertToBinary(decimalNumber);
        System.out.println("Двоичное представление числа: " + binaryRepresentation);
    }

    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0"; // базовый случай: число 0 в двоичной системе
        } else if (number < 0) {
            return "-" + convertToBinary(-number); // обработка отрицательных чисел
        } else {
            int remainder = number % 2;
            int quotient = number / 2;
            String binaryPart = convertToBinary(quotient);
            return binaryPart + remainder;
        }
    }
}