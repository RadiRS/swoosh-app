package com.radirusadi.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.radirusadi.swoosh.R
import com.radirusadi.swoosh.Utilities.EKSTRA_LEAGUE
import com.radirusadi.swoosh.Utilities.EKSTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var leugue = intent.getStringExtra(EKSTRA_LEAGUE)
        var skill = intent.getStringExtra(EKSTRA_SKILL)

        searchLeaguText.text = "Looking for $leugue $skill league near you"

    }
}
