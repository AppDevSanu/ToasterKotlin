package com.example.toaster_kotlin

import android.content.Context
import android.widget.Toast

object ToasterKotlin {
    @JvmStatic fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}