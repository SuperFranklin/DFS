import java.util.*;

public class DFS {

    private DFS(){

    }

    public static List<Integer> search(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> visited = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(start);
        while (!stack.isEmpty()) {
            int vertex = stack.removeLast();

            if (!visited.contains(vertex)) {
                visited.add(vertex);
                List<Integer> childrens = graph.get(vertex);
                Collections.reverse(childrens);

                for (int child : childrens) {
                    if (!visited.contains(child)) {
                        stack.addLast(child);
                    }
                }
            }
        }

        return visited;
    }
}
