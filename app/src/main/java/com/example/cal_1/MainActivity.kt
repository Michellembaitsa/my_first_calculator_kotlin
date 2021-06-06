package com.example.cal_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var enterNum1=findViewById<TextView>(R.id.tvNum1)
        var enterNum2=findViewById<TextView>(R.id.tvNum2)
        var results=findViewById<TextView>(R.id.tvResults)
        var etNum1=findViewById<EditText>(R.id.etNum1)
        var etNum2=findViewById<EditText>(R.id.etNum2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnMinus=findViewById<Button>(R.id.btnMinus)
        var btnDivide=findViewById<Button>(R.id.btnDivide)
        var btnModulus=findViewById<Button>(R.id.btnModulus)

        btnAdd.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                var input1=etNum1.text.toString().toInt()
                var input2=etNum2.text.toString().toInt()
                var sum=input1-input2
                results.text="${sum}"

        }}
        btnMinus.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                var input1=etNum1.text.toString().toInt()
                var input2=etNum2.text.toString().toInt()
                var minus=input1-input2
                results.text="${minus}"

            }}
        btnDivide.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                var input1=etNum1.text.toString().toInt()
                var input2=etNum2.text.toString().toInt()
                var divide=input1-input2
                results.text="${divide}"

            }}
        btnModulus.setOnClickListener {


            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                var input1=etNum1.text.toString().toInt()
                var input2=etNum2.text.toString().toInt()
                var modulus=input1-input2
                results.text="${modulus}"

            }
        }
    }
}