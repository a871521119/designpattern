package com.sz.ucar.享元模式;

/**
 * 享元模式测试类
 */
public class FlyweightPatternDemo {
    /**
     * 定义颜色值
     */
    private static final String colors[] =
            {"红色", "绿色", "蓝色", "白色", "黑色"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    /**
     * 随机获取圆的颜色
     *
     * @return
     */
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    /**
     * 随机获取圆X轴坐标
     *
     * @return
     */
    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    /**
     * 随机获取圆Y轴坐标
     *
     * @return
     */
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
