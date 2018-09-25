package androidatc.com.android_calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var N1=Number1.text
        var N2=Number2.text


        button_plus.setOnClickListener {
            var sum_result= N1.toString().toDouble()+ N2.toString().toDouble()
            result_view.text= sum_result.toString()
        }

        button_minus.setOnClickListener {
            var minus_result= N1.toString().toDouble() - N2.toString().toDouble()
            result_view.text= minus_result.toString()
        }
        button_multiply.setOnClickListener {
            var multiply_result= N1.toString().toDouble() * N2.toString().toDouble()
            result_view.text= multiply_result.toString()
        }

        button_divide.setOnClickListener {
            var division_result= N1.toString().toDouble() / N2.toString().toDouble()
            result_view.text= division_result.toString()
        }


    }}
