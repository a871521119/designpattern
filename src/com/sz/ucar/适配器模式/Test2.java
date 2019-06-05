package com.sz.ucar.适配器模式;


import com.ucar.EnglishPlug;
import com.ucar.LoacalChinaPlug;
import com.ucar.classadapter.PlugAdapter;
import com.ucar.classadapter.PlugAdapter2;

public class Test2 {
    public static void main(String a[]) {
        /**类适配器*/
        EnglishPlug englishPlug = new PlugAdapter();
        englishPlug.englishLooks();
        englishPlug.englishVoltage();
        /**对象适配器*/
        EnglishPlug englishPlug1 = new PlugAdapter2(new LoacalChinaPlug());
        englishPlug1.englishLooks();
        englishPlug1.englishVoltage();
    }
}