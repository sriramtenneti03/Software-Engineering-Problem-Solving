package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ValidAnagramTest { @Test void comparesCharacterCounts() { assertTrue(ValidAnagram.isAnagram("anagram","nagaram")); assertFalse(ValidAnagram.isAnagram("rat","car")); assertTrue(ValidAnagram.isAnagram("","")); assertTrue(ValidAnagram.isAnagram("åa","aå")); } }
