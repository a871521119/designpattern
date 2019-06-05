package com.sz.ucar.组合模式.safe;

/**
 * @author zhang chao
 * @time 2019/1/23/023 11:13
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 图片文件 Leaf
 */
public class File extends AbstractFile {

    public File(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("我是" + name + "--Leaf(叶子对象)");
    }
}
