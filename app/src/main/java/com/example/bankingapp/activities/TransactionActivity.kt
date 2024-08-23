package com.example.bankingapp.activities

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.bankingapp.R
import com.example.bankingapp.adapters.TransactionAdapter
import com.example.bankingapp.models.Transaction
import com.example.bankingapp.services.BankService

class TransactionActivity : AppCompatActivity() {

    private lateinit var transactionListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)

        transactionListView = findViewById(R.id.listViewTransactions)

        val transactions: List<Transaction> = BankService.getTransactionHistory()

        // Assuming you have an adapter to display the transactions
        val adapter = TransactionAdapter(this, transactions)
        transactionListView.adapter = adapter
    }
}
