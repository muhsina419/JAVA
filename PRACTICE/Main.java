import java.util.*;

class Solution {
    public List<Integer> shortestPath(int n, int m, List<List<Integer>> edges) {
        List<List<Pair>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (List<Integer> edge : edges) {
            int u = edge.get(0), v = edge.get(1), w = edge.get(2);
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        int[] dist = new int[n + 1];
        int[] prev = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        dist[1] = 0;
        pq.offer(new Pair(1, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.node;
            int currentDist = current.weight;

            if (currentDist > dist[u]) continue;

            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.node;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    prev[v] = u;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        if (dist[n] == Integer.MAX_VALUE) {
            return Collections.singletonList(-1);
        }

        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        path.add(0, dist[n]);
        return path;
    }

    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int m = 6;
        List<List<Integer>> edges = Arrays.asList(
            Arrays.asList(1, 2, 2),
            Arrays.asList(1, 3, 4),
            Arrays.asList(2, 3, 1),
            Arrays.asList(2, 4, 7),
            Arrays.asList(3, 5, 3),
            Arrays.asList(4, 5, 1)
        );

        List<Integer> result = sol.shortestPath(n, m, edges);
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < result.size(); i++) {
                if (i == 0) {
                    System.out.print(result.get(i));
                } else {
                    System.out.print(" " + result.get(i));
                }
            }
            System.out.println();
        }
    }
}