package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)

fun main() {
    val passedStudents = students.filter { it.score >= 70 }
    println("1. Jumlah siswa dengan nilai >= 70: ${passedStudents.size}")

    println("\n2. Daftar siswa dan nilainya:")
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    println("\n3. Tiga siswa dengan nilai tertinggi:")
    students.sortedByDescending { it.score }
        .take(3)
        .map { it.name }
        .forEach { println(it) }

    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = totalScore.toDouble() / students.size
    println("\n4. Total: $totalScore   Average: $averageScore")

    println("\n5. Pengelompokan siswa berdasarkan tahun:")
    students.groupBy { it.year }
        .forEach { (year, group) ->
            val names = group.map { it.name }
            println("$year: $names")
        }
}