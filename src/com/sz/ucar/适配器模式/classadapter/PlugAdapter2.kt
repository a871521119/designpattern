package com.ucar.classadapter
import com.ucar.EnglishPlug
import com.ucar.LoacalChinaPlug

class PlugAdapter2(var plug: LoacalChinaPlug) : EnglishPlug {
    override fun englishVoltage() {
        plug.chinaVoltage()
    }

    override fun englishLooks() {
        plug.chinaLooks()
    }
}
