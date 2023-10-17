package com.example.incredecriproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform