package com.example.hw05.task1

fun main() {
    // 1. Double an Int
    val double: (Int) -> Int = { it * 2 }
    println(double(7))

    // 2. Check if a String starts with a vowel (case-insensitive)
    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Return the larger of two Ints
    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
}