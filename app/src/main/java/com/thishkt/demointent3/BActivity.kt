package com.thishkt.demointent3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        btn_back.setOnClickListener {
            val intent = Intent()
            intent.putExtra("book_isbn","1234567890")
            setResult(404,intent)
            finish()
        }
    }
}
