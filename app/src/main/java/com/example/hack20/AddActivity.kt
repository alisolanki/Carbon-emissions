package com.example.hack20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var listView = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Activity1", "Points1"))
        list.add(Model("Activity2", "Points2"))

        listView.adapter = MyAdapter(this, R.layout.row, list )
    }
}
