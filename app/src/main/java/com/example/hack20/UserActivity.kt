package com.example.hack20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        button_addactivity.setOnClickListener {
            var intent = Intent(this, AddActivity::class.java)
            startActivity(intent);
        }

        button_calender.setOnClickListener {
            var intent = Intent(this, CalenderActivity::class.java)
            startActivity(intent);
        }
    }
}
