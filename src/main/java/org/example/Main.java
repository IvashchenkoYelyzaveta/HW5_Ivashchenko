package org.example;

import my_int.MyInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyInt a1 = new MyInt(3);
        MyInt a2 = new MyInt(a1.getX());

        System.out.println("Значення a1: " + a1.getX());
        System.out.println("Значення a2: " + a2.getX());

        a1.setX(10);

        System.out.println("Значення a1: " + a1.getX());
        System.out.println("Значення a2: " + a2.getX());

        Point point1 = new Point(3, 5);
        Point point2 = new Point(2, 4);
        Point point3 = new Point(10, 8);
        Point point4 = new Point(6, 9);

        Point[] pointsArray = {point1, point2, point3, point4};

        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i].info();
        }

        System.out.println();

        for (int i = 0; i < pointsArray.length; i++) {
            if (pointsArray[i].checkDoubles()) {
                pointsArray[i].info();
            }
        }


        


    }
}