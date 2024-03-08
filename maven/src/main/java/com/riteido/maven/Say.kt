package com.riteido.maven

import android.app.AlertDialog
import android.content.Context

class Say {
    companion object {
        fun hello(context: Context, name: String) {
            AlertDialog.Builder(context)
                .setTitle(name)
                .setPositiveButton("OK", null)
                .show()
        }
    }
}