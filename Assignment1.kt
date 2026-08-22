package com.pes.lib

fun main() {
    val data = "Hi! How are you?"

    // 1. how many vowels in the string
    val vowelCount = data.count { it in "aeiouAEIOU" }
    println("Number of vowels: $vowelCount")

    // 2. how many spaces
    val spaceCount = data.count { it == ' ' }
    println("Number of spaces: $spaceCount")

    // use of 'when' as a expression
    val result = when {
        vowelCount > 5 -> "Vowel count is $vowelCount - Many vowels"
        vowelCount > 2 -> "Vowel count is $vowelCount - Some vowels"
        else -> "Vowel count is $vowelCount - Few vowels"
    }
    println(result)
}