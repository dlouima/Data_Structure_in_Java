package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList newList = new DoublyLinkedList(7);
        newList.append(25);
        newList.append(5);

        newList.getHead();
        newList.getTail();
        newList.getLenght();
        newList.printList();

        newList.removeFirst();
        newList.getHead();
        newList.getLenght();
        newList.printList();
        ;

    }
}
