package com.example.a24012011197_mad_practical7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val personList = ArrayList<Person>()

        personList.add(
            Person(
                "1",
                "Yesenia Yang",
                "yesenia_yang@gnu.ac.in",
                "+917983385148",
                "16 Sackett Street, Courtland, Michigan",
                23.03,
                72.58
            )
        )

        personList.add(
            Person(
                "2",
                "John Smith",
                "john@gmail.com",
                "+919876543210",
                "Ahmedabad, Gujarat",
                23.02,
                72.57
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = PersonAdapter(personList)
    }
}