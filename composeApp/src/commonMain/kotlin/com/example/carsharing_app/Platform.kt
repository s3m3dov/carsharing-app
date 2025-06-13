package com.example.carsharing_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform