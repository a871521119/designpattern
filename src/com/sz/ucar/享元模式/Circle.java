package com.sz.ucar.享元模式;

/**
 * 圆形实现类
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形: 颜色 : " + color
                + ",位置 x : " + x + ", 位置 y :" + y + ", 半径 :" + radius);
    }
}
