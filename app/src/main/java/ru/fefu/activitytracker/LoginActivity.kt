package ru.fefu.activitytracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity(R.layout.login_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val loginButton = findViewById<MaterialButton>(R.id.loginActivity_Button_Login)
        loginButton.setOnClickListener { TODO() }

        val toolbar = findViewById<Toolbar>(R.id.loginActivity_panel_upper)
        toolbar.setNavigationOnClickListener() {
            finish()
        }
    }
}