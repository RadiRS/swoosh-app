package com.radirusadi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.radirusadi.swoosh.Utilities.EKSTRA_LEAGUE
import com.radirusadi.swoosh.R
import com.radirusadi.swoosh.Utilities.EKSTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EKSTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClick (view: View){
        bellerSkillBtn.isChecked = false
        skill = "beginner"

        if (!beginnerSkillBtn.isChecked == true)
            skill = ""

    }

    fun onBellerClick (view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"

        if (!bellerSkillBtn.isChecked == true)
            skill = ""
    }

    fun onSkillFinishClick (view: View){
        if (skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EKSTRA_LEAGUE, league)
            finishActivity.putExtra(EKSTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select skill.", Toast.LENGTH_LONG).show()
        }

    }
}
