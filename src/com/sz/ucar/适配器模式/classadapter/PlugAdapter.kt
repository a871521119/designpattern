package com.ucar.classadapter

import com.ucar.EnglishPlug
import com.ucar.LoacalChinaPlug

class PlugAdapter : LoacalChinaPlug(), EnglishPlug {
    override fun englishVoltage() {
        chinaVoltage()
    }

    override fun englishLooks() {
        chinaLooks()
    }
}