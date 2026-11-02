package com.sriram.dsa.binarysearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class KokoEatingBananasTest { @Test void findsMinimumFeasibleSpeed() { assertEquals(4,KokoEatingBananas.minEatingSpeed(new int[]{3,6,7,11},8)); assertEquals(30,KokoEatingBananas.minEatingSpeed(new int[]{30,11,23,4,20},5)); assertEquals(1,KokoEatingBananas.minEatingSpeed(new int[]{1,1,1},3)); } }
