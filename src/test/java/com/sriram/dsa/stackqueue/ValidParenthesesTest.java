package com.sriram.dsa.stackqueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ValidParenthesesTest { @Test void validatesNestedAndMalformedPairs() { assertTrue(ValidParentheses.isValid("()[]{}")); assertTrue(ValidParentheses.isValid("{[()]}")); assertFalse(ValidParentheses.isValid("(]")); assertFalse(ValidParentheses.isValid("(")); assertTrue(ValidParentheses.isValid("")); } }
