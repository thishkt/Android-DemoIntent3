package com.thishkt.demointent3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btn_next_page.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
//            startActivity(intent)
            startActivityForResult(intent, 1001)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.d("AActivity", "requestCode: $requestCode")
        Log.d("AActivity", "resultCode: $resultCode")

        if (requestCode == 1001 && resultCode == 404) {
            Log.d("AActivity", "條件成立")
            val book_isbn = data?.getStringExtra("book_isbn")
            Log.d("AActivity", "book_isbn: $book_isbn")

        } else {
            Log.d("AActivity", "條件不成立")
        }
    }
}
