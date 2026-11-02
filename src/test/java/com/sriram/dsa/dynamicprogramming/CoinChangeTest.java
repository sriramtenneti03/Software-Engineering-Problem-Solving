package com.sriram.dsa.dynamicprogramming;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CoinChangeTest { @Test void findsMinimumCoinsOrReportsImpossibleAmount() { assertEquals(3,CoinChange.minCoins(new int[]{1,2,5},11));assertEquals(-1,CoinChange.minCoins(new int[]{2},3));assertEquals(0,CoinChange.minCoins(new int[]{1},0));assertEquals(1,CoinChange.minCoins(new int[]{2,5},5)); } }
