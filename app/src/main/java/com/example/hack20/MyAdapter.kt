package com.example.hack20

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.row.view.*


class MyAdapter(var mCtx:Context, var resources:Int, var items:List<Model>): ArrayAdapter<Model>(mCtx, resources, items)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val activityTextView:View = view.findViewById(R.id.activityTextView)
        val valueTextView:View = view.findViewById(R.id.valueTextView)

        var mItem:Model = items[position]
        view.activityTextView.text = mItem.name
        view.valueTextView.text = mItem.points

        return view
    }
}