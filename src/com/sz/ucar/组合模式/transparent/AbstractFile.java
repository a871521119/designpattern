package com.sz.ucar.组合模式.transparent;

/**
 * @author zhang chao
 * @time 2019/1/23/023 14:56
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc Component
 */
public abstract class AbstractFile {

    /**
     * 文件名字
     */
    String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    /**
     * 添加文件
     * @param file
     */
    abstract void add(AbstractFile file);

    /**
     * 移除文件
     * @param file
     */
    abstract void remove(AbstractFile file);

    /**
     * 获取文件
     * @param index
     */
    abstract AbstractFile getChild(int index);

    /**
     * 显示文件信息
     */
    abstract void display();
}
