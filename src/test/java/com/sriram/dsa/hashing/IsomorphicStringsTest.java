package com.sriram.dsa.hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class IsomorphicStringsTest { @Test void requiresConsistentOneToOneMapping() { assertTrue(IsomorphicStrings.areIsomorphic("egg","add")); assertFalse(IsomorphicStrings.areIsomorphic("foo","bar")); assertFalse(IsomorphicStrings.areIsomorphic("ab","aa")); assertTrue(IsomorphicStrings.areIsomorphic("","")); } }
