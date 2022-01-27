package ru.fefu.activitytracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.button.MaterialButton

class RegistrationActivity : AppCompatActivity(R.layout.registration_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val toolbar = findViewById<Toolbar>(R.id.regActivity_panel_upper)
        toolbar.setNavigationOnClickListener() {
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