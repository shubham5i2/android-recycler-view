package com.sks.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private var countryNameList = ArrayList<String>()
    private var detailList = ArrayList<String>()
    private var imageList = ArrayList<Int>()

    private lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("India")
        countryNameList.add("United Kingdom")
        countryNameList.add("USA")
        countryNameList.add("Germany")
        countryNameList.add("Canada")

        detailList.add("This is India flag")
        detailList.add("This is United Kingdom flag")
        detailList.add("This is USA flag")
        detailList.add("This is Germany flag")
        detailList.add("This is Canada flag")

        imageList.add(R.drawable.india)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.usa)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.canada)

        adapter = CountryAdapter(countryNameList, detailList, imageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}