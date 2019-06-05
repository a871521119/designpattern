package com.sz.ucar.享元模式;

import java.util.HashMap;

/**
 * 形状工厂类
 */
public class ShapeFactory {
    /**
     * hashMap缓存要绘制的形状
     */
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("创建圆形颜色 : " + color);
        }
        return circle;
    }
}
