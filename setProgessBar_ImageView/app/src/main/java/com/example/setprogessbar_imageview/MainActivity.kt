package com.example.setprogessbar_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.inputmethod.InputBinding
import android.widget.SeekBar
import com.example.setprogessbar_imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText1.setText("mensaje puesto desde el binding")
        //Log.d("ACSCO", getDrawable(R.drawable.martin2).toString())
        binding.SeekBarD.setOnSeekBarChangeListener(object:
        SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                binding.editText1.setText("Cambiando Progreso")
            }

            override fun onStartTrackingTouch(p0: SeekBar) {
                binding.editText2.setText("Cambiando progreso mientras se ")
            }

            override fun onStopTrackingTouch(p0: SeekBar) {
                binding.editText2.setText("Dejamos de deslizar")
                binding.editText3.setText(binding.SeekBarD.progress.toString())
            }

        })

        binding.SeekBarContinua.setOnSeekBarChangeListener(object:
            SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean){
                binding.editText1.setText("Cambiando progreso")
                var progreso = binding.SeekBarContinua.progress / 10.0
                binding.progressBar.progress = progreso.toInt()
                binding.editText2.setText(progreso.toInt())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar){
                binding.editText2.setText("Starting traking")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.editText3.setText("Stopping traking")
                var progreso = binding.SeekBarContinua.progress / 10.0
                binding.editText1.setText(progreso.toString())
            }

        })

    }
}

