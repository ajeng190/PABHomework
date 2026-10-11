package com.example.hw02.task2

fun main() {
    val daysRemaining = 2

    val statusMessage = if (daysRemaining < 0) {
        "Overdue"
    } else if (daysRemaining == 0) {
        "Due today"
    } else {
        "Upcoming"
    }
    println(statusMessage)

    val month = 9

    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Month $month: $monthName")
}