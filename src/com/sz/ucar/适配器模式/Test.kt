package com.ucar

import com.ucar.classadapter.PlugAdapter
import com.ucar.classadapter.PlugAdapter2


class Test

fun main() {
    var plug = PlugAdapter().also {
        it.englishLooks()
        it.englishVoltage()
    }


    var plug2 = PlugAdapter2(LoacalChinaPlug()).also {
        it.englishLooks()
        it.englishVoltage()
    }

}


