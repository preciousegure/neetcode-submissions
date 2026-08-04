class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0) +1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a));
        heap.addAll(freqMap.keySet());

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }
        return result;
    }
}
