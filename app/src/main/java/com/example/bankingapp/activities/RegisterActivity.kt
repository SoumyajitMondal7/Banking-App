package com.example.bankingapp.activities


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.bankingapp.R
import com.example.bankingapp.models.User
import com.example.bankingapp.services.BankService

class RegisterActivity : AppCompatActivity() {

    private lateinit var usernameField: EditText
    private lateinit var passwordField: EditText
    private lateinit var emailField: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        usernameField = findViewById(R.id.editTextUsername)
        passwordField = findViewById(R.id.editTextPassword)
        emailField = findViewById(R.id.editTextEmail)
        registerButton = findViewById(R.id.buttonRegister)

        registerButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()
            val email = emailField.text.toString()

            val user = User(username, password, email)
            val success = BankService.registerUser(user)

            if (success) {
                startActivity(Intent(this, LoginActivity::class.java))
            } else {
                // Handle registration failure
            }
        }
    }
}
