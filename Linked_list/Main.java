package Linked_list;

public class Main {
    public static void main(String[] args) {

        LinkedList newList = new LinkedList(25);
        newList.Append(35);
        newList.Append(20);

        newList.getHead();
        newList.getTail();
        newList.getLenght();

        // newList.prepend(10);
        newList.printList();
        newList.reverse();
        newList.getHead();
        newList.getTail();
        newList.getLenght();

        newList.printList();

        // System.out.println(newList.removeLast(35).value);

    }
}