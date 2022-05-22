public class Main {
    public static void main(String[] args) {

        HashTable newHashTable = new HashTable();

        newHashTable.set("nails", 100);
        newHashTable.set("tile", 50);
        newHashTable.set("lumber", 720);
        newHashTable.set("bolts", 200);
        newHashTable.set("screws", 140);

        newHashTable.printTable();

        System.out.println(newHashTable.get("tile"));

        System.out.println(newHashTable.keys());
    }

}
