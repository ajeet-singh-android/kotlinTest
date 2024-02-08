package com.example.kotlintest

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var choice: Int

    do {
        println("Welcome to Simple Calculator")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
        print("Enter your choice: ")

        try {
            choice = scanner.nextInt()
            when (choice) {
                1 -> performAddition(scanner)
                2 -> performSubtraction(scanner)
                3 -> performMultiplication(scanner)
                4 -> performDivision(scanner)
                5 -> println("Exiting the program...")
                else -> println("Invalid choice! Please enter a number between 1 and 5.")
            }
        } catch (e: NoSuchElementException) {
            println("Invalid input! Please enter a number.")
            scanner.nextLine() // Consume invalid input
            choice = 0 // Reset choice to avoid infinite loop
        }
    } while (choice != 5)
}

fun performAddition(scanner: Scanner) {
    print("Enter first number: ")
    val num1 = scanner.nextDouble()
    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    val result = num1 + num2
    println("Result of addition: $result")
}

fun performSubtraction(scanner: Scanner) {
    print("Enter first number: ")
    val num1 = scanner.nextDouble()
    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    val result = num1 - num2
    println("Result of subtraction: $result")
}

fun performMultiplication(scanner: Scanner) {
    print("Enter first number: ")
    val num1 = scanner.nextDouble()
    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    val result = num1 * num2
    println("Result of multiplication: $result")
}

fun performDivision(scanner: Scanner) {
    print("Enter first number: ")
    val num1 = scanner.nextDouble()
    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    if (num2 != 0.0) {
        val result = num1 / num2
        println("Result of division: $result")
    } else {
        println("Error: Cannot divide by zero!")
    }
}
