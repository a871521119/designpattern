package com.sz.ucar.组合模式.safe;

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
     * 显示文件信息
     */
    abstract void display();
}
