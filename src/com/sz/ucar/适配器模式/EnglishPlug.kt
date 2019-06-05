package com.ucar

/**
 * 英国三角插头
 */
open interface EnglishPlug {
    /**
     * 插头的样子
     */
    fun englishLooks()

    /**
     * 英国的标准电压
     */
    fun englishVoltage()
}
