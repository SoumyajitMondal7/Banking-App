package com.example.bankingapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.bankingapp.R
import com.example.bankingapp.models.Transaction

class TransactionAdapter(
    private val context: Context,
    private val transactions: List<Transaction>
) : BaseAdapter() {

    override fun getCount(): Int = transactions.size

    override fun getItem(position: Int): Any = transactions[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.transaction_item, parent, false)

        val transaction = transactions[position]
        val textViewDescription: TextView = view.findViewById(R.id.textViewDescription)
        val textViewAmount: TextView = view.findViewById(R.id.textViewAmount)

        textViewDescription.text = transaction.description
        textViewAmount.text = transaction.amount.toString()

        return view
    }
}
