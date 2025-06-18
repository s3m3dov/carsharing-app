package com.cimhub.carsharing_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform