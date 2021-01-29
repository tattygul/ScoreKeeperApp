package com.example.scorekeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun threePointToAOnClick(view: View) {
        displayTeamA(3)
    }

    fun twoPointToAOnClick(view: View) {
        displayTeamA(2)
    }
    fun freeThrowToAOnClick(view: View) {
        displayTeamA(1)
    }
    fun threePointToBOnClick(view: View) {
        displayTeamB(3)
    }
    fun twoPointOnToBClick(view: View) {
        displayTeamB(2)
    }
    fun freeThrowToBOnClick(view: View) {
        displayTeamB(1)
    }

    fun reset(view: View) {
        var teamA: TextView = findViewById<TextView>(R.id.scoreTeamATextView)
        teamA.text = 0.toString()

        var teamB: TextView = findViewById<TextView>(R.id.scoreTeamBTextView)
        teamB.text = 0.toString()


    }

    private fun displayTeamA(i: Int) {
        var teamA: TextView = findViewById<TextView>(R.id.scoreTeamATextView)
        var scoreTeamA: Int = teamA.text.toString().toInt()
        scoreTeamA += i
        teamA.text = scoreTeamA.toString()
    }

    private fun displayTeamB(i: Int) {
        var teamB: TextView = findViewById<TextView>(R.id.scoreTeamBTextView)
        var scoreTeamB: Int = teamB.text.toString().toInt()
        scoreTeamB += i
        teamB.text = scoreTeamB.toString()

    }
}