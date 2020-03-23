package com.example.logicaapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSubmit.setOnClickListener {
            checkInput()
        }
    }





    fun checkInput(){
        var correctAmount = 0
        val  text = "correct"
        val  firstFldInpt = fldCase1.getText().toString()
        val secondFldInpt = fldCase2.getText().toString()
        val thirdFldInput = fldCase3.getText().toString()
        val fourthFldInput = fldCase4.getText().toString()

        if(firstFldInpt == "T") {
            correctAmount = correctAmount + 1
        }
        if(secondFldInpt == "F"){
            correctAmount = correctAmount + 1
        }
        if(thirdFldInput == "F"){
            correctAmount = correctAmount + 1
        }
        if(fourthFldInput == "F"){
            correctAmount = correctAmount + 1
        }
        val toastMessage= getString(R.string.correctAmt, correctAmount)

        val toast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show()



    }


}
