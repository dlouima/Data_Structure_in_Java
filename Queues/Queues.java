public class Queues {
    private Node first;
    private Node last;
    private int lenght;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queues(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght = 1;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;

        }
    }

    public void getFirst() {
        System.out.println("Head: " + first.value);
    }

    public void getLast() {
        System.out.println("Tail: " + last.value);
    }

    public void getLenght() {
        System.out.println("Length: " + lenght);

    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        lenght++;
    }

    public Node dequeue() {
        if (lenght == 0)
            return null;
        Node temp = first;
        if (lenght == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        lenght--;
        return temp;

    }
}