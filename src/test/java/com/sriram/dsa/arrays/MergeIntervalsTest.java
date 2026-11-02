package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MergeIntervalsTest { @Test void mergesOverlapsAndKeepsSeparatedRanges() { assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, MergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})); assertArrayEquals(new int[][]{{1,5}}, MergeIntervals.merge(new int[][]{{1,4},{4,5}})); assertArrayEquals(new int[0][2], MergeIntervals.merge(new int[0][2])); } }
