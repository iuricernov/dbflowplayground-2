package com.iuri.dbflowplayground

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_someone.*

class AddSomeoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_someone)

        save_button.setOnClickListener {
            requestedSave()
        }
    }

    private fun requestedSave() {
        if (name_edit_text.text?.isBlank() != false) {
            showError("Please fill a name")
            return
        }

        if (surname_edit_text.text?.isBlank() != false) {
            showError("Please fill a surname")
            return
        }

        if (!male_radio_button.isChecked && !female_radio_button.isChecked) {
            showError("Please choose male or female")
            return
        }

        // TODO save it

        setResult(RESULT_OK)
        finish()
    }

    private fun showError(message: String) {
        AlertDialog.Builder(this)
            .setTitle("Attention")
            .setMessage(message)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }
}
