package com.practice

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val calendar =Calendar.getInstance()
    val currentTime =SimpleDateFormat("HH:MM:SS a")
    val currentTime2 =SimpleDateFormat("HH:MM:SS a")
    val saveTime = currentTime.format(calendar.time)
    val saveTime2  =currentTime.format(calendar.time)
    println(saveTime)
    println(saveTime2)
    val saveTime3 =currentTime2.format(calendar.time)
    println(saveTime3)
    println((saveTime.toBigDecimal()  - saveTime2.toBigDecimal()))

}