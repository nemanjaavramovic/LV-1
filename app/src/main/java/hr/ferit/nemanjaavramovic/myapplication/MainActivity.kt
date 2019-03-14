package hr.ferit.nemanjaavramovic.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.nfc.Tag
import android.transition.TransitionManager
import android.util.Log
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.cbpopup.*
import android.view.LayoutInflater



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }

    public class InspiringPerson{
        var name: String=""
        var bordie: String=""
        var quote: String=""
        var about: String=""
    }



    public fun setUpUi() {
        var charlesbabbage=InspiringPerson()
        charlesbabbage.name=getString(R.string.CharlesBabbage)
        charlesbabbage.bordie=getString(R.string.cbbor)
        charlesbabbage.quote=getString(R.string.cbquote)
        charlesbabbage.about=getString(R.string.cbtxt)
        var georgeboole=InspiringPerson()
        georgeboole.name=getString(R.string.GeorgeBoole)
        georgeboole.bordie=getString(R.string.gbbor)
        georgeboole.quote=getString(R.string.gbquote)
        georgeboole.about=getString(R.string.gbtxt)
        var alanturing=InspiringPerson()
        alanturing.name=getString(R.string.AlanTuring)
        alanturing.bordie=getString(R.string.atbor)
        alanturing.quote=getString(R.string.atquote)
        alanturing.about=getString(R.string.attxt)


        image.setOnClickListener {displayMessage(charlesbabbage.quote)}
        image2.setOnClickListener {displayMessage2(georgeboole.quote)}
        image3.setOnClickListener {displayMessage3(alanturing.quote)}
        button.setOnClickListener { opencbpopup() }
        button2.setOnClickListener {opengbpopup()}
        button3.setOnClickListener { openatpopup() }
    }



    private fun openatpopup() {
        var builder:AlertDialog.Builder=AlertDialog.Builder(this)
        var inflater: LayoutInflater= layoutInflater
        var view:View=inflater.inflate(R.layout.atpopup,null)
        builder.setView(view)
        var dialog: Dialog= builder.create()
        dialog.show()
    }

    private fun opengbpopup() {
            var builder:AlertDialog.Builder=AlertDialog.Builder(this)
            var inflater: LayoutInflater= layoutInflater
            var view:View=inflater.inflate(R.layout.gbpopup,null)
            builder.setView(view)
            var dialog: Dialog= builder.create()
            dialog.show()
    }

    private fun opencbpopup() {
        var builder:AlertDialog.Builder=AlertDialog.Builder(this)
        var inflater: LayoutInflater= layoutInflater
        var view:View=inflater.inflate(R.layout.cbpopup,null)
        builder.setView(view)
        var dialog: Dialog= builder.create()
        dialog.show()
    }


    private fun displayMessage3(quote: String) {
        Toast.makeText(this, quote, Toast.LENGTH_SHORT)
            .show()
    }

    private fun displayMessage2(quote: String) {
        Toast.makeText(this,quote,Toast.LENGTH_SHORT)
            .show()
    }

    private fun displayMessage(quote: String) {
        Toast.makeText(this,quote,Toast.LENGTH_SHORT)
            .show()
    }
}
