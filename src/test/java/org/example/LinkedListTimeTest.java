package org.example;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * класс тестирующий корректность работы функций класса LinkedListTime
 */
public class LinkedListTimeTest {

    /**
     * проверяет корректность возвращаемого значения функцией addTest
     */
    @Test
    public void addTest()
    {
        LinkedListTime expected=new LinkedListTime(1000);
        assertTrue(0<expected.addTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией getTest
     */
    @Test
    public void getTest()
    {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        LinkedListTime expected=new LinkedListTime(list);
        assertTrue(0<expected.getTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией setTest
     */
    @Test
    public void setTest()
    {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        LinkedListTime expected=new LinkedListTime(list);
        assertTrue(0<expected.setTest());
    }

    /**
     * проверяет корректность возвращаемого значения функцией deleteTest
     */
    @Test
    public void deleteTest()
    {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        LinkedListTime expected=new LinkedListTime(list);
        assertTrue(0<expected.deleteTest());
    }
}