
public class Main {
    public static void main(String[] args) {
        Queues newQ = new Queues(25);
        newQ.getFirst();
        newQ.getLast();

        newQ.enqueue(2);

        newQ.printList();
    }

}
