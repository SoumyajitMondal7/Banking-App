package com.example.bankingapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.bankingapp.R  // Import the R class from the correct package

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of navigation to AccountActivity
        findViewById<Button>(R.id.buttonAccountDetails).setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
        }

        // Example of navigation to TransactionActivity
        findViewById<Button>(R.id.buttonTransactionHistory).setOnClickListener {
            startActivity(Intent(this, TransactionActivity::class.java))
        }
    }
}
