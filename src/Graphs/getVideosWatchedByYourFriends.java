package Graphs;
class Solution {
    class pair implements Comparable<pair> {
        String video;
        int freq;
        pair(String video, int freq) {
            this.video = video;
            this.freq = freq;
        }
        public int compareTo(pair that) {
            if (this.freq == that.freq)
                return this.video.compareTo(that.video);
            return this.freq - that.freq;
        }
    }

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer> q = new LinkedList<>();
        int curLevel = 0;
        HashSet<Integer> visited = new HashSet<>();

        q.offer(id); // corrected
        visited.add(id); // corrected

        while (!q.isEmpty() && curLevel < level) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int front = q.poll();
                for (int friend : friends[front]) {
                    if (!visited.contains(friend)) {
                        q.offer(friend);
                        visited.add(friend);
                    }
                }
            }
            curLevel++;
        }

        HashMap<String, Integer> map = new HashMap<>();
        while (!q.isEmpty()) {
            int front = q.poll();
            for (String temp : watchedVideos.get(front))
                map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        List<pair> videolist = new ArrayList<>();
        for (String video : map.keySet()) {
            videolist.add(new pair(video, map.get(video)));
        }

        Collections.sort(videolist);

        List<String> res = new ArrayList<>();
        for (pair p : videolist)
            res.add(p.video);

        return res;
    }
}

