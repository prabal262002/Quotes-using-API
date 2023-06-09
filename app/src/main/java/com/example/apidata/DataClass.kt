package com.example.apidata

data class DataClass(
    val limit: Int,
    val quotes: List<Quote>,
    val skip: Int,
    val total: Int
)