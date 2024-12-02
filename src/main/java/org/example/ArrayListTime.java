package org.example;

import java.util.ArrayList;

/**
 * класс для тестирования основных методов класса ArrayList по времени их работы
 */
public class ArrayListTime {

    /**
     * экземпляр класса ArrayList, на котором будут проводиться тесты
     */
    private ArrayList<Integer> arrayList;

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
     * @param n количество повторений
     */
    public ArrayListTime(int n)
    {
        iterations=n;
        arrayList=new ArrayList<>();
        startTime=0;
        endTime=0;
    }

    /**
     * конструктор класса
     * @param list список
     */
    public ArrayListTime(ArrayList<Integer> list)
    {
        iterations= list.size();
        arrayList=list;
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
            arrayList.add(i);

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
            arrayList.remove(arrayList.size()-1);
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
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        //System.out.println(arrayList);
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
            arrayList.set(i,iterations-i);
        }
        endTime = System.nanoTime();
        //System.out.println(arrayList);
        //System.out.println(endTime - startTime);
        return endTime - startTime;
    }
}