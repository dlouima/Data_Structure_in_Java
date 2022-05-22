public class Main {
    public static void main(String[] args) {

        Stack newStack = new Stack(25);
        newStack.push(100);
        newStack.push(2);
        newStack.getTop();
        newStack.getHieght();
        newStack.printStack();
        System.out.println("next");

        newStack.pop();
        newStack.printStack();

    }
}