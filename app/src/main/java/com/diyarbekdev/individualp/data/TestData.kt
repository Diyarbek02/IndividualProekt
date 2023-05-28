package com.diyarbekdev.individualp.data

data class TestData(
    val id: Int,
    val question:String,
    val options: List<String>,
    val correctAnswerId: Int
)