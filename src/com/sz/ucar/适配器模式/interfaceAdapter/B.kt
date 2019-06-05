package com.ucar.interfaceAdapter

/**
 * 详见
 */
class B : Adapter() {
    override fun e() {
        println("实现A方法被调用")
    }

    override fun d() {
        println("实现d方法被调用")
    }
}