package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpirallyTraversingTest {


        SpirallyTraversing obj;
        @Before
        public void setUp() throws Exception {
        obj = new SpirallyTraversing();
    }

        @After
        public void tearDown() throws Exception {
        obj = null;
    }

        @Test
        public void testSpiral() {
    assertEquals("1",obj.spiralPrint( 6,3,new int[][]{{1,  2,  3,  4,  5,  6},
        {7,  8,  9,  10, 11, 12},
        {13, 14, 15, 16, 17, 18}}));
        }

}
