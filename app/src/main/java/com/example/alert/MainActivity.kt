package com.example.alert
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("Are you sure you want to exit?")
        alertDialogBuilder.setCancelable(false)
        alertDialogBuilder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> finish() })
        alertDialogBuilder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}