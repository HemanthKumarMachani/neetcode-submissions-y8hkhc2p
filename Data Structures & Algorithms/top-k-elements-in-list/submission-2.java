class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //make sure input is valid
        if (nums == null || nums.length == 0)
            return nums;
        //count the frequency of each num
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int[] topKFrequent = new int[k];
        int index = 0;
        //We'll add the Map to Max Head priority Queue
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));
        pq.addAll(freqMap.entrySet());
        while (!pq.isEmpty() && index < k) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            topKFrequent[index++] = entry.getKey();
        }
        return topKFrequent;
    }
}