/*
    Question 4: Online Exam Result Analyzer Using ArrayList
*/

fun displayMarks(marks: ArrayList<Int>) {
    for (i in marks.indices) {
        println("Student ${i + 1} : ${marks[i]}")
    }
}

fun highestMarks(marks: ArrayList<Int>): Int {
    var highest = marks[0]

    for (value in marks) {
        if (value > highest) {
            highest = value
        }
    }

    return highest
}

fun lowestMarks(marks: ArrayList<Int>): Int {
    var lowest = marks[0]

    for (value in marks) {
        if (value < lowest) {
            lowest = value
        }
    }

    return lowest
}

fun calculateAverage(marks: ArrayList<Int>): Double {
    var total = 0

    for (value in marks) {
        total += value
    }

    return total.toDouble() / marks.size
}

fun findGrade(mark: Int): Char {
    return when {
        mark >= 90 -> 'A'
        mark >= 75 -> 'B'
        mark >= 60 -> 'C'
        mark >= 40 -> 'D'
        else -> 'F'
    }
}

fun main() {

    val studentMarks = ArrayList<Int>()

    studentMarks.add(95)
    studentMarks.add(42)
    studentMarks.add(76)
    studentMarks.add(88)
    studentMarks.add(55)
    studentMarks.add(63)
    studentMarks.add(29)
    studentMarks.add(91)
    studentMarks.add(74)
    studentMarks.add(58)


    println("===== Student Marks Report =====")
    displayMarks(studentMarks)


    var passCount = 0
    var failCount = 0

    for (mark in studentMarks) {
        if (mark >= 40) {
            passCount++
        } else {
            failCount++
        }
    }

    println("\n===== Pass/Fail Analysis =====")
    println("Passed Students : $passCount")
    println("Failed Students : $failCount")
    println("Pass Percentage : ${passCount * 100.0 / studentMarks.size}%")
    println("Fail Percentage : ${failCount * 100.0 / studentMarks.size}%")


    println("\n===== Grade Report =====")

    for (i in studentMarks.indices) {
        println(
            "Student ${i + 1} (${studentMarks[i]}) -> Grade ${findGrade(studentMarks[i])}"
        )
    }


    val average = calculateAverage(studentMarks)

    println("\n===== Performance Analysis =====")

    println("Highest Marks : ${highestMarks(studentMarks)}")
    println("Lowest Marks : ${lowestMarks(studentMarks)}")
    println("Average Marks : %.2f".format(average))


    var aboveAverageCount = 0

    for (mark in studentMarks) {
        if (mark > average) {
            aboveAverageCount++
        }
    }

    println("Students Scoring Above Average : $aboveAverageCount")


    println("\n===== Special Student Report =====")

    var specialCount = 0

    for (i in studentMarks.indices) {

        if (studentMarks[i] > 80 && studentMarks[i] != 91) {

            println(
                "Student ${i + 1} : ${studentMarks[i]}"
            )

            specialCount++
        }
    }

    println("Total Special Students : $specialCount")
}