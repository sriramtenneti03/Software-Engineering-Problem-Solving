package com.sriram.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public final class TopKFrequentElements {
    private TopKFrequentElements() { }

    /** Keeps the k most frequent values; ties use ascending value for stable results. O(n log k). */
    public static int[] find(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int value : nums) counts.merge(value, 1, Integer::sum);
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int byCount = Integer.compare(counts.get(a), counts.get(b));
            return byCount != 0 ? byCount : Integer.compare(b, a);
        });
        for (int value : counts.keySet()) { heap.add(value); if (heap.size() > k) heap.remove(); }
        int[] result = new int[heap.size()];
        for (int i = result.length - 1; i >= 0; i--) result[i] = heap.remove();
        return result;
    }
}
