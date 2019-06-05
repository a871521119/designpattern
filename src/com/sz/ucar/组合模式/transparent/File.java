package com.sz.ucar.组合模式.transparent;

/**
 * @author zhang chao
 * @time 2019/1/23/023 11:13
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 文件 Leaf
 */
public class File extends AbstractFile {

    public File(String name) {
        super(name);
    }

    @Override
    void add(AbstractFile file) {
        System.out.println(name + "不能添加文件");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println(name + "不能删除文件");
    }

    @Override
    AbstractFile getChild(int index) {
        return null;
    }

    @Override
    void display() {
        System.out.println("我是" + name + "--Leaf(叶子对象)");
    }
}
