package com.sriram.dsa.backtracking;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class SubsetsTest { @Test void emitsEveryChoiceIncludingEmptySubset() { assertEquals(List.of(List.of(),List.of(1),List.of(1,2),List.of(2)),Subsets.generate(new int[]{1,2})); assertEquals(List.of(List.of()),Subsets.generate(new int[]{})); } }
