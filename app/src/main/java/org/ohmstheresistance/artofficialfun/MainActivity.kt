package org.ohmstheresistance.artofficialfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, box_six_text, box_seven_text, box_eight_text,
                box_nine_text, main_activity_constraint_layout, blue_button, yellow_button, green_button )

        for (item in clickableViews) {

            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {

        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(getColor(R.color.colorOne))
            R.id.box_two_text -> view.setBackgroundColor(getColor(R.color.colorNine))
            R.id.box_three_text -> view.setBackgroundColor(getColor(R.color.colorFour))
            R.id.box_four_text -> view.setBackgroundColor(getColor(R.color.colorTen))
            R.id.box_five_text -> view.setBackgroundColor(getColor(R.color.colorThree))
            R.id.box_six_text -> view.setBackgroundColor(getColor(R.color.colorTwo))
            R.id.box_seven_text -> view.setBackgroundColor(getColor(R.color.colorFive))
            R.id.box_eight_text -> view.setBackgroundColor(getColor(R.color.colorSix))
            R.id.box_nine_text -> view.setBackgroundColor(getColor(R.color.colorEight))

            R.id.blue_button -> {
                box_one_text.setBackgroundColor(getColor(R.color.blue_color))
                box_four_text.setBackgroundColor(getColor(R.color.blue_color))
                box_seven_text.setBackgroundColor(getColor(R.color.blue_color))
            }
            R.id.yellow_button -> {
                box_three_text.setBackgroundColor(getColor(R.color.yellow_color))
                box_six_text.setBackgroundColor(getColor(R.color.yellow_color))
                box_nine_text.setBackgroundColor(getColor(R.color.yellow_color))
            }
            R.id.green_button -> {
                box_two_text.setBackgroundColor(getColor(R.color.green_color))
                box_five_text.setBackgroundColor(getColor(R.color.green_color))
                box_eight_text.setBackgroundColor(getColor(R.color.green_color))
            }


            else -> view.setBackgroundColor(getColor(android.R.color.holo_red_light))
        }
    }

}
