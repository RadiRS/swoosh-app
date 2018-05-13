package com.radirusadi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.radirusadi.swoosh.Model.Player
import com.radirusadi.swoosh.R
import com.radirusadi.swoosh.Utilities.EKSTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","") // class player with extends parcelable

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EKSTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EKSTRA_PLAYER)
        }
    }

    fun onMensClick(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"

        if (!mensLeagueBtn.isChecked)
            player.league = ""
    }

    fun onWomensClick (view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"

        if (!womensLeagueBtn.isChecked)
            player.league = ""
    }

    fun onCoedClick (view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"

        if (!coedLeagueBtn.isChecked)
            player.league = ""
    }

    fun leagueNextClick (view: View){
        if (player.league != ""){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EKSTRA_PLAYER, player)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}
