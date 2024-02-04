package com.example.computer_quiz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform