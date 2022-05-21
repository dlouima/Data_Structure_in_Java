package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int lenght;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;

        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLenght() {
        System.out.println("Length: " + lenght);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {

            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        lenght++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (lenght == 0) {
            return null;
        }
        if (lenght == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        lenght--;
        return temp;

    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        lenght++;

    }

    public Node removeFirst() {

        if (lenght == 0)
            return null;
        Node temp = head;
        if (lenght == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temp.next = null;
            head.prev = null;

        }
        lenght--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > lenght) {
            return null;
        }
        Node temp = head;
        if (index < lenght / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = lenght; i > index; i--) {
                temp = temp.prev;

            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        } else {
            return false;
        }

    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > lenght)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == lenght) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.next = after;
        after.prev = newNode;
        before.next = newNode;
        newNode.prev = before;
        lenght++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > lenght)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == lenght)
            return removeLast();
        Node temp = get(index);
        Node before = get(-1);
        Node after = temp.next;
        temp.next = null;
        temp.prev = null;
        before.next = after;
        after.prev = before;
        lenght--;
        return temp;

    }

}
