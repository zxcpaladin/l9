package lr10.example5;

public class Recursion {
    public static void main(String[] args) {
        int N = 10; // Заданный номер в последовательности
        int num1 = 0, num2 = 1;

        System.out.print("Последовательность Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
