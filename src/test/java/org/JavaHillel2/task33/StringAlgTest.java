package org.JavaHillel2.task33;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringAlgTest {

    @Test
    public void testGetNumberParts1() {
        int actual = new StringAlg().getNumberParts("aaaaa,bbbbbbb,bbbbbbbb,bbbbbbbb");
        assertEquals(4, actual);
    }

    @Test
    public void testGetNumberParts2() {
        int actual = new StringAlg().getNumberParts(" ");
        assertEquals(1, actual);
    }

}