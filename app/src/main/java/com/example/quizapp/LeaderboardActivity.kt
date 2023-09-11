package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class LeaderboardActivity : AppCompatActivity() {

    private lateinit var list:ArrayList<LeaderboardModel>
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        list = ArrayList()
        recyclerView = findViewById(R.id.recyclerview_leaderboard)
        list.add(LeaderboardModel("Vandan Nandwana",R.drawable.run,"220",R.drawable.gold_badge,"#1"))
        list.add(LeaderboardModel("Nikhil Kumar",R.drawable.police,"200",R.drawable.gold_badge,"#2"))
        list.add(LeaderboardModel("Vivek Tiwari",R.drawable.arrest,"150",R.drawable.silver_badge,"#3"))
        list.add(LeaderboardModel("Andry",R.drawable.maa,"100",R.drawable.silver_badge,"#4"))
        list.add(LeaderboardModel("Pratham Kave",R.drawable.kill,"100",R.drawable.silver_badge,"#5"))
        list.add(LeaderboardModel("Soham",R.drawable.job,"85",R.drawable.brown_badge,"#6"))
        list.add(LeaderboardModel("Raj",R.drawable.run,"50",R.drawable.brown_badge,"#7"))
        list.add(LeaderboardModel("Akhil",R.drawable.police,"30",R.drawable.brown_badge,"#8"))
        list.add(LeaderboardModel("Kailash",R.drawable.arrest,"10",R.drawable.brown_badge,"#9"))
        list.add(LeaderboardModel("Rajesh",R.drawable.arrest,"9",R.drawable.brown_badge,"#10"))
        val layoutManager:LayoutManager = LinearLayoutManager(this)
        val adapter = LeaderboardAdapter(list)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter




    }
}