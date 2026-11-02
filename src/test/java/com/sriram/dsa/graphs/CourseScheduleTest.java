package com.sriram.dsa.graphs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CourseScheduleTest { @Test void distinguishesDagFromCycleAndAllowsIndependentCourses() { assertTrue(CourseSchedule.canFinish(2,new int[][]{{1,0}})); assertFalse(CourseSchedule.canFinish(2,new int[][]{{1,0},{0,1}})); assertTrue(CourseSchedule.canFinish(3,new int[][]{})); assertTrue(CourseSchedule.canFinish(0,new int[][]{})); } }
