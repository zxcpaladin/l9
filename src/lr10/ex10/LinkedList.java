package lr10.ex10;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }


    // Методы для ввода с головы и хвоста
    public void createHead(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void createTail(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Метод toString для вывода элементов списка
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    // Метод AddFirst для добавления элемента в начало списка
    public void addFirst(E data) {
        createHead(data);
    }

    // Метод AddLast для добавления элемента в конец списка
    public void addLast(E data) {
        createTail(data);
    }

    // Метод Insert для вставки элемента на указанную позицию
    public void insert(int index, E data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            createHead(data);
        } else {
            Node<E> newNode = new Node<>(data);
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // Метод RemoveFirst для удаления элемента с головы списка
    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        E removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    // Метод RemoveLast для удаления последнего элемента списка
    public E removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if (head.next == null) {
            return removeFirst();
        }
        Node<E> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        E removedData = current.next.data;
        current.next = null;
        size--;
        return removedData;
    }

    // Метод Remove для удаления элемента по указанному индексу
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            return removeFirst();
        }
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E removedData = current.next.data;
        current.next = current.next.next;
        size--;
        return removedData;
    }

    // Другие методы (createHeadRec, createTailRec, toStringRec)

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("List: " + list); // Вывод: List: 10 20 30
    }
}
