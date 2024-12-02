package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * класс тестирующий корректность работы функций класса ArrayListTime
 */
public class ArrayListTimeTest {

    /**
     * проверяет корректность возвращаемого значения функцией addTest
     */
    @Test
    public void addTest()
    {
        ArrayListTime expected=new ArrayListTime(1000);
        assertTrue(0<expected.addTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией getTest
     */
    @Test
    public void getTest()
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        ArrayListTime expected=new ArrayListTime(list);
        assertTrue(0<expected.getTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией setTest
     */
    @Test
    public void setTest()
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        ArrayListTime expected=new ArrayListTime(list);
        assertTrue(0<expected.setTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией deleteTest
     */
    @Test
    public void deleteTest()
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        ArrayListTime expected=new ArrayListTime(list);
        assertTrue(0<expected.deleteTest());
    }
}