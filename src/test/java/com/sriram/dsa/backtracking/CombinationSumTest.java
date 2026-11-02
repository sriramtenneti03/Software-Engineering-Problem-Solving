package com.sriram.dsa.backtracking;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class CombinationSumTest { @Test void reusesCandidatesAndLeavesInputAlone() { int[] candidates={2,3,6,7}; assertEquals(List.of(List.of(2,2,3),List.of(7)),CombinationSum.find(candidates,7));assertArrayEquals(new int[]{2,3,6,7},candidates);assertTrue(CombinationSum.find(new int[]{2},1).isEmpty());assertEquals(List.of(List.of()),CombinationSum.find(new int[]{1,2},0)); } }
