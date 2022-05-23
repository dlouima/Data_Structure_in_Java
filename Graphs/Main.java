public class Main {
    public static void main(String[] args) {
        Graph newGraph = new Graph();
        newGraph.addVertex("P");
        newGraph.addVertex("A");
        newGraph.addVertex("B");
        newGraph.addEdge("B", "A");
        newGraph.addEdge("B", "A");

        newGraph.pringGraph();
        newGraph.addVertex("K");
        newGraph.removeVertex("P");
        newGraph.pringGraph();

    }

}
