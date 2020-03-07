package com.endrawan.hottestrapper.models

data class Rapper(
    val name: String,
    val desc: String,
    val origin: String,
    val born: String,
    val netWorth: String,
    val imageUrl: String,
    val stream: Stream,
    val discography: List<Album>
)