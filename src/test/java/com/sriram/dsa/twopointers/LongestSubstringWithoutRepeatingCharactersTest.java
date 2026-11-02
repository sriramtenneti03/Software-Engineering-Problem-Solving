package com.sriram.dsa.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LongestSubstringWithoutRepeatingCharactersTest { @Test void slidesPastOnlyRepeatsInsideTheCurrentWindow() { assertEquals(3, LongestSubstringWithoutRepeatingCharacters.length("abcabcbb")); assertEquals(1, LongestSubstringWithoutRepeatingCharacters.length("bbbbb")); assertEquals(3, LongestSubstringWithoutRepeatingCharacters.length("pwwkew")); assertEquals(0, LongestSubstringWithoutRepeatingCharacters.length("")); } }
