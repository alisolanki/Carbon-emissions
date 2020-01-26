package com.example.hack20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.AdapterView
import android.widget.CalendarView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calender.*
import kotlinx.android.synthetic.main.activity_calender.view.*

class CalenderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        var listView = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.setOnDateChangeListener { view, year, month, day ->
            //list.add(Model("year", "day.toString()" ))
            //list.add(Model( "date", "50"))
            //list.add(Model("Planted a tree", "100"))

            list.add(Model("Travel", "50"))
            list.add(Model("Planted a tree", "100"))

            listView.adapter = MyAdapter(this, R.layout.row, list)

            listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
                if (position == 0) {
                    Toast.makeText(this@CalenderActivity, day.toString() + "/" + (month+1).toString() + "/" + year.toString(), Toast.LENGTH_SHORT).show()
                }
                if (position == 1) {
                    Toast.makeText(this@CalenderActivity, "You clicked on Planted a Tree!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
