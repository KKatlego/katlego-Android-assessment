package com.glucode.about_you.about.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.glucode.about_you.R
import com.glucode.about_you.engineers.models.Engineer

class ProfileCardView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val profileImageView: ImageView
    private val nameTextView: TextView
    private val roleTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.view_profile_card, this, true)
        profileImageView = findViewById(R.id.profile_image)
        nameTextView = findViewById(R.id.engineer_name)
        roleTextView = findViewById(R.id.engineer_role)
    }

    fun bind(engineer: Engineer) {

        nameTextView.text = engineer.name
        roleTextView.text = engineer.role
    }
}
