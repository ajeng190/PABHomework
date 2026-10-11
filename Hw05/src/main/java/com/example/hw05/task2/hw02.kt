package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    for (item in items) {
        if (condition(item)) {
            println(item)
        }
    }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    val result = mutableListOf<String>()
    for (item in list) {
        result.add(mapper(item))
    }
    return result
}

fun main() {
    val doubleOperation: (Int) -> Int = { it * 2 }
    val resultApply = applyTwice(3, doubleOperation)
    println("Hasil applyTwice (Expected: 12): $resultApply")

    val courses = listOf("Algoritma", "Basis Data", "Matematika", "Struktur Data", "Pemrograman")
    val vowelCheck: (String) -> Boolean = { it.first().lowercaseChar() in setOf('a', 'i', 'u', 'e', 'o') }

    println("\nMata kuliah yang berawalan huruf vokal:")
    printIf(courses, vowelCheck)

    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println("\nHasil transform kuadrat ke String (Expected: [4, 9, 16]): $squaredStrings")
}