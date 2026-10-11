package com.example.hw05.task5

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)

fun main() {
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = String.format("%.1f", totalScore.toDouble() / students.size)
    println("Class average: $averageScore")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { student ->
            val status = if (student.score >= 70) "PASS" else "FAIL"
            // Menggunakan format spasi sejajar agar rapi sesuai bentuk output
            val paddedName = student.name.padEnd(8)
            val paddedScore = student.score.toString().padEnd(4)
            appendLine("$paddedName$paddedScore$status")
        }
    }
    print(report)
}