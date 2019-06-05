package com.sz.ucar.原型模式;
import java.util.ArrayList;

public class BookDeepCopy implements Cloneable {
    private String title;// 标题
    private ArrayList<String> image = new ArrayList<String>();// 图片名列表

    public BookDeepCopy() {
        super();
    }

    /**
     * 重写拷贝方法
     */
    @Override
    protected BookDeepCopy clone()  {
        try {
            BookDeepCopy book = (BookDeepCopy) super.clone();
            book.image = (ArrayList<String>) this.image.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void addImage(String img) {
        this.image.add(img);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 打印内容
     */
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title：" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}
