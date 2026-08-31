package com.pes.lib

fun getNumber(data: String): Int {
    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid input: $data is not a number")
        0
    }
}

fun main() {
    println("Result for 12: ${getNumber("12")}")
    println("Result for a1as: ${getNumber("a1as")}")
}
