package lr10.ex9;

import java.util.LinkedList;
import java.util.Scanner;

public class JosephusLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + k - 1) % circle.size();
            circle.remove(index);
        }

        System.out.println(circle.get(0));
    }
}
