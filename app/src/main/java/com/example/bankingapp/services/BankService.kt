package com.example.bankingapp.services;

import java.util.Date
import com.example.bankingapp.models.Account
import com.example.bankingapp.models.Transaction
import com.example.bankingapp.models.User

object BankService {

    private val users = mutableListOf<User>()
    private val account = Account("123456789", 1000.0)
    private val transactions = mutableListOf(
        Transaction(Date(), -100.0, "Grocery Shopping"),
        Transaction(Date(), 500.0, "Salary Deposit")
    )

    fun registerUser(user: User): Boolean {
        if (users.any { it.username == user.username }) {
            return false // User already exists
        }
        users.add(user)
        return true
    }

    fun getAccountDetails(): Account {
        return account
    }

    fun getTransactionHistory(): List<Transaction> {
        return transactions
    }
}
