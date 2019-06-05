package com.sz.ucar.组合模式.transparent;

/**
 * @author zhang chao
 * @time 2019/1/23/023 11:19
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class Test {

    public static void main(String[] args){
        AbstractFile folder = new Folder("根文件夹");
        folder.add(new File("文本文件1"));
        folder.add(new File("图片文件1"));
        AbstractFile folderChild = new Folder("文件夹1");
        folderChild.add(new File("文本文件2"));
        folderChild.add(new File("图片文件2"));
        folder.add(folderChild);
        folder.display();
    }
}
