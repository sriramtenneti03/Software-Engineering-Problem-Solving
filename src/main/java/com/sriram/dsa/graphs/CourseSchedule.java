package com.sriram.dsa.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class CourseSchedule {
    private CourseSchedule() { }
    /** Kahn's topological traversal detects whether all courses can be removed. O(V+E) time and space. */
    public static boolean canFinish(int courseCount, int[][] prerequisites) {
        List<List<Integer>> next = new ArrayList<>(courseCount); for (int i = 0; i < courseCount; i++) next.add(new ArrayList<>());
        int[] indegree = new int[courseCount];
        for (int[] pair : prerequisites) { next.get(pair[1]).add(pair[0]); indegree[pair[0]]++; }
        Queue<Integer> ready = new ArrayDeque<>(); for (int i = 0; i < courseCount; i++) if (indegree[i] == 0) ready.add(i);
        int completed = 0;
        while (!ready.isEmpty()) { int course = ready.remove(); completed++; for (int following : next.get(course)) if (--indegree[following] == 0) ready.add(following); }
        return completed == courseCount;
    }
}
