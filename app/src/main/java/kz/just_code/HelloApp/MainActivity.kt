package kz.just_code.HelloApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kz.just_code.HelloApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textView = findViewById(R.id.text_view)
        editText = findViewById(R.id.input_text)
        button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            textView.text = "Nice to meet you ${editText.text}"
        })
    }

}