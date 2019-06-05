package com.ucar.interfaceAdapter

fun main() {
    var a = B().also {
        it.e()
        it.d()
    }
}