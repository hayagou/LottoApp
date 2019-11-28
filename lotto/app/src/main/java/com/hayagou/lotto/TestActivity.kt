package com.hayagou.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        // 코드에서 View에 이벤트 리스너를 설정하는 방법

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, ConstellationActivity::class.java)

            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)

            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            startActivity(intent)
        }


    }


    fun goConstellation(view: View) {
        val intent = Intent(this, ConstellationActivity::class.java)
        startActivity(intent)
    }

    fun callweb(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }

}
