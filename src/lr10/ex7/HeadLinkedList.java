package lr10.ex7;

public class HeadLinkedList {
    Node head;

    public void addToHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        HeadLinkedList list = new HeadLinkedList();

        list.addToHead(3);
        list.addToHead(2);
        list.addToHead(1);

        list.display();
    }
}
