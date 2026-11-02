package com.sriram.dsa.hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FirstUniqueCharacterTest { @Test void returnsEarliestUniqueIndexOrMinusOne() { assertEquals(0, FirstUniqueCharacter.index("leetcode")); assertEquals(2, FirstUniqueCharacter.index("loveleetcode")); assertEquals(-1, FirstUniqueCharacter.index("aabb")); assertEquals(-1, FirstUniqueCharacter.index("")); } }
