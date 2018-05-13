package com.radirusadi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.radirusadi.swoosh.Model.Player
import com.radirusadi.swoosh.R
import com.radirusadi.swoosh.Utilities.EKSTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EKSTRA_PLAYER)
    }

    fun onBeginnerClick (view: View){
        bellerSkillBtn.isChecked = false
        player.skill = "beginner"

        if (!beginnerSkillBtn.isChecked == true)
            player.skill = ""

    }

    fun onBellerClick (view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"

        if (!bellerSkillBtn.isChecked == true)
            player.skill = ""
    }

    fun onSkillFinishClick (view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EKSTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select skill.", Toast.LENGTH_LONG).show()
        }

    }
}
