package com.example.bankingapp.models

import java.util.Date

data class Transaction(
    val date: Date,
    val amount: Double,
    val description: String
)
