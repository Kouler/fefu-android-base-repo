package ru.fefu.activitytracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class RegistrationActivity : AppCompatActivity(R.layout.registration_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val backButton = findViewById<MaterialButton>(R.id.regActivity_button_Back)
        backButton.setOnClickListener {
            finish()
        }

        /*val sexSpinner = findViewById<Spinner>(R.id.regActivity_Spinner_sex)
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_sex_values,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            sexSpinner.adapter = adapter
        }
*/
    }
}