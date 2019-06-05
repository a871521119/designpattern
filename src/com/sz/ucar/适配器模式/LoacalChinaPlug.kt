package com.ucar

/**
 * 英国当地的三角叉头
 */
open class LoacalChinaPlug : ChinaPlug {
    override fun chinaVoltage() {
        println("中国电压220V")
    }

    override fun chinaLooks() {
        println("我这是中国当地的插头")
    }
}