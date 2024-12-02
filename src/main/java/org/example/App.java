package org.example;

import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 * класс для демонстрации сравнения коллекций по времени работы методов
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner(System.in);
        System.out.println ("Enter quantity iterations:");
        int n = console.nextInt();

        ArrayListTime arrtest=new ArrayListTime(n);
        LinkedListTime linktest=new LinkedListTime(n);

        JFrame frame = new JFrame();
        frame.setTitle("Comparison table of ArrayList and LinkedList collections");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"method", "collection", "number of times execution", "time in ns"};

        Object[][] data = {
                {"add", "ArrayList", n, arrtest.addTest()},
                {"", "LinkedList", n, linktest.addTest()},
                {"get", "ArrayList", n, arrtest.getTest()},
                {"", "LinkedList", n, linktest.getTest()},
                {"set", "ArrayList", n, arrtest.setTest()},
                {"", "LinkedList", n, linktest.setTest()},
                {"remove", "ArrayList", n, arrtest.deleteTest()},
                {"", "LinkedList", n, linktest.deleteTest()},
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);
        table.setFont(new Font("Times New Roman",Font.PLAIN,18));
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Times New Roman",Font.BOLD,18));
        frame.add(scrollPane);
        frame.setSize(900, 300);
        frame.setVisible(true);

//        System.out.println("method   "+"collection   "+"number of times execution   "+"time in ns");
//        System.out.println("_____________________________________________________________________");
//        System.out.println("add      "+"ArrayList    "+"         "+n+"              "+arrtest.addTest());
//        System.out.println("         "+"LinkedList   "+"         "+n+"              "+linktest.addTest());
//        System.out.println("_____________________________________________________________________");
//        System.out.println("get      "+"ArrayList    "+"         "+n+"              "+arrtest.getTest());
//        System.out.println("         "+"LinkedList   "+"         "+n+"              "+linktest.getTest());
//        System.out.println("_____________________________________________________________________");
//        System.out.println("set      "+"ArrayList    "+"         "+n+"              "+arrtest.setTest());
//        System.out.println("         "+"LinkedList   "+"         "+n+"              "+linktest.setTest());
//        System.out.println("_____________________________________________________________________");
//        System.out.println("remove   "+"ArrayList    "+"         "+n+"              "+arrtest.deleteTest());
//        System.out.println("         "+"LinkedList   "+"         "+n+"              "+linktest.deleteTest());
    }
}
