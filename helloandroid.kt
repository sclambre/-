package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // 起動時に実行される
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        // ボタンがタップされた処理
        var count = 1
        binding.tapHere.setOnClickListener {
            if (count % 2 != 0) {
                binding.textView.text = "ボタンがタップされました"
                binding.textView2.text = "count:" + count
                binding.img01.setImageResource(R.drawable.giraffe)

            }else{
                binding.textView.text = "ちわ！あんどろいど！"
                binding.textView2.text = "count:" + count
                binding.img01.setImageResource(R.drawable.lion)
            }
            count++
        }

    }
}
