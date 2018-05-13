package com.radirusadi.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.radirusadi.swoosh.Model.Player
import com.radirusadi.swoosh.R
import com.radirusadi.swoosh.Utilities.EKSTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EKSTRA_PLAYER)

        searchLeaguText.text = "Looking for ${player.league} ${player.skill} league near you"

    }
}
