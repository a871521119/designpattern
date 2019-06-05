package com.ucar

/**
 * 英国当地的三角叉头
 */
open class LoacalEngPlug : EnglishPlug {
    override fun englishVoltage() {
        println("英国电压230V")
    }

    override fun englishLooks() {
        println("我这是英国当地的插头")
    }
}