package com.arekb.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform