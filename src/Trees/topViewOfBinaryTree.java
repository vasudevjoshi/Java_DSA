package Trees;

class Solution {
    static class Pair {
        int key;
        Node node;

        Pair(int key, Node node) {
            this.key = key;
            this.node = node;
        }
    }

    static ArrayList<Integer> topView(Node root) {
        Map<Integer, Node> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            int hd = temp.key;
            Node node = temp.node;

            // Only add the node if it's the first one at this horizontal distance
            if (!map.containsKey(hd)) {
                map.put(hd, node);
            }

            if (node.left != null) {
                q.offer(new Pair(hd - 1, node.left));
            }
            if (node.right != null) {
                q.offer(new Pair(hd + 1, node.right));
            }
        }

        // Sort keys and build result
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        for (int key : sortedKeys) {
            result.add(map.get(key).data);
        }

        return result;
    }
}

