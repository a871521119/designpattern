package com.sz.ucar.组合模式.safe;

import java.util.ArrayList;

/**
 * @author zhang chao
 * @time 2019/1/23/023 15:03
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 文件夹
 */
public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    /**
     * 添加文件
     * @param file
     */
    void add(AbstractFile file) {
        fileList.add(file);
    }

    /**
     * 移除文件
     * @param file
     */
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    /**
     * 获取文件
     * @param index
     * @return
     */
    public AbstractFile getChild(int index) {
        if(index < fileList.size()){
            return fileList.get(index);
        }
        return null;
    }

    @Override
    void display() {
        System.out.println("我是" + name + "--Composite(容器对象)");
        for(AbstractFile file : fileList){
            file.display();
        }
    }
}
