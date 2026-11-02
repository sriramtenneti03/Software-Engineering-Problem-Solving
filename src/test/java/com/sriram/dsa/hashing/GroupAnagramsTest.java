package com.sriram.dsa.hashing;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class GroupAnagramsTest { @Test void groupsWordsAndPreservesFirstGroupOrder() { assertEquals(List.of(List.of("eat","tea","ate"),List.of("tan","nat"),List.of("bat")), GroupAnagrams.group(new String[]{"eat","tea","tan","ate","nat","bat"})); assertTrue(GroupAnagrams.group(new String[]{}).isEmpty()); } }
