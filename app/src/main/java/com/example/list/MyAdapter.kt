package com.example.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyAdapter(var mCtx: Context, var resources: Int, var items: List<Model>) :
    ArrayAdapter<Model>(mCtx, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)
        val titleTextView: TextView = view.findViewById(R.id.mainText)
        var myItem: Model = items[position]
        titleTextView.text = myItem.title

        return view

}}