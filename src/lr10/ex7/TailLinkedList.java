package lr10.ex7;

public class TailLinkedList {
    Node head;
    Node tail;

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TailLinkedList list = new TailLinkedList();

        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);

        list.display();
    }
}
