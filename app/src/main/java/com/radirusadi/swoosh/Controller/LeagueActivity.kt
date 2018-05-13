package com.radirusadi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.radirusadi.swoosh.Utilities.EKSTRA_LEAGUE
import com.radirusadi.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensClick(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"

        if (!mensLeagueBtn.isChecked)
            selectedLeague = ""
    }

    fun onWomensClick (view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"

        if (!womensLeagueBtn.isChecked)
            selectedLeague = ""
    }

    fun onCoedClick (view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"

        if (!coedLeagueBtn.isChecked)
            selectedLeague = ""
    }

    fun leagueNextClick (view: View){
        if (selectedLeague != ""){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EKSTRA_LEAGUE, selectedLeague)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}
