package dev.sobhy.bmapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var firstNum: EditText
    private lateinit var secondNum: EditText
    private lateinit var button: Button
    private lateinit var result: TextView
    private var num1: Int=0
    private var num2: Int=0
    private var resultNum: Int= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        button.setOnClickListener{
            try {
                num1=  firstNum.text.toString().toInt()
                num2= secondNum.text.toString().toInt()
                resultNum = num1 + num2
                result.text = resultNum.toString()
            } catch (e : Exception){
                result.text = "you should enter two number"
            }

        }

    }
    private fun initView(){
        firstNum = findViewById(R.id.first_num)
        secondNum = findViewById(R.id.second_num)
        button = findViewById(R.id.button)
        result = findViewById(R.id.result)
    }
}