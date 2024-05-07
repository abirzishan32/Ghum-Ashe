package com.example.ghumashee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
    @Test
    public void AreaTest(){
        Circle circle = new Circle("circle", 5);
        double are = Math.PI * 5 * 5;
        assertEquals("The area of the circle is correct", are, circle.area(), 0.001);
    }

    @Test
    public void PeriTest(){
        Circle circle = new Circle("circle", 3);
        double peri = 2 * Math.PI * 3;
        assertEquals(peri, circle.parimeter(), 0.001);

    }
}
