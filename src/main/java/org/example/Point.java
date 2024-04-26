package org.example;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void info() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public boolean checkDoubles () {
        return x % 2 == 0 && y % 2 == 0;
    }
}
