package com.example.bankingapp.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bankingapp.R
import com.example.bankingapp.models.Account
import com.example.bankingapp.services.BankService // Ensure this import is correct

class AccountActivity : AppCompatActivity() {

    private lateinit var accountNumberView: TextView
    private lateinit var balanceView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        accountNumberView = findViewById(R.id.textViewAccountNumber)
        balanceView = findViewById(R.id.textViewBalance)

        val account: Account = BankService.getAccountDetails()

        accountNumberView.text = account.accountNumber
        balanceView.text = account.balance.toString()
    }
}
