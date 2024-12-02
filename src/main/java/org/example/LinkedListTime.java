package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * класс для тестирования основных методов класса LinkedList по времени их работы
 */
public class LinkedListTime {

    /**
     * экземпляр класса ArrayList, на котором будут проводиться тесты
     */
    private LinkedList<Integer> linkedList;

    /**
     * переменные, хранящие начало и конец отсчета времени
     */
    private long startTime, endTime;

    /**
     * количество повторений для проверки
     */
    private int iterations;

    /**
     * конструктор класса
     * @param n количество итераций
     */
    public LinkedListTime(int n)
    {
        iterations=n;
        linkedList=new LinkedList<>();
        startTime=0;
        endTime=0;
    }

    /**
     * конструктор класса
     * @param list список
     */
    public LinkedListTime(LinkedList<Integer> list)
    {
        iterations= list.size();
        linkedList=list;
        startTime=0;
        endTime=0;
    }

    /**
     * тестирует время заполнения списка элементами
     * @return время заполнения
     */
    public long addTest(){
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * тестирует время удаления всех элементов списка с конца
     * @return время, затраченное на удаление
     */
    public long deleteTest()
    {
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.removeLast();
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * тестирует время получения элементов списка
     * @return затраченное время
     */
    public long getTest()
    {
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * тестирует время изменения элементов списка
     * @return затраченное время
     */
    public long setTest()
    {
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.set(i,iterations-i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

}