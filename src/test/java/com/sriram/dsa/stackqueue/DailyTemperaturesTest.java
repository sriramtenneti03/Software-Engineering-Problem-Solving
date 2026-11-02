package com.sriram.dsa.stackqueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DailyTemperaturesTest { @Test void resolvesOnlyDaysWithAWarmerFuture() { assertArrayEquals(new int[]{1,1,4,2,1,1,0,0},DailyTemperatures.waitDays(new int[]{73,74,75,71,69,72,76,73})); assertArrayEquals(new int[]{0},DailyTemperatures.waitDays(new int[]{30})); assertArrayEquals(new int[0],DailyTemperatures.waitDays(new int[]{})); } }
