package com.example.hack20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class CalenderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        var listView = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model( "Travel", "50"))
        list.add(Model("Planted a tree", "100"))

        listView.adapter = MyAdapter(this, R.layout.row, list )

        listView.setOnItemClickListener{parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position==0){
                Toast.makeText(this@CalenderActivity, "You clicked on Travel!", Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@CalenderActivity, "You clicked on Planted a Tree!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
