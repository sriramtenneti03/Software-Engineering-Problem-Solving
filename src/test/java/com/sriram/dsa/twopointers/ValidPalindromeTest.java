package com.sriram.dsa.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ValidPalindromeTest { @Test void ignoresPunctuationAndCase() { assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")); assertFalse(ValidPalindrome.isPalindrome("race a car")); assertTrue(ValidPalindrome.isPalindrome(" ")); assertTrue(ValidPalindrome.isPalindrome("")); } }
