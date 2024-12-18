package dev.blend.module.api

enum class Category {
    COMBAT,
    MOVEMENT,
    PLAYER,
    VISUAL,
    CLIENT,
    OTHER;
    val properName get() = name.uppercase()[0] + name.lowercase().substring(1)
}