package dikaartha.example.aplikasisederhana

import dikaartha.example.aplikasisederhana.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lengthInput: EditText
    private lateinit var widthInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultVolume: TextView
    private lateinit var resultArea: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lengthInput = findViewById(R.id.lengthInput)
        widthInput = findViewById(R.id.widthInput)
        heightInput = findViewById(R.id.heightInput)
        calculateButton = findViewById(R.id.calculateButton)
        resultVolume = findViewById(R.id.resultVolume)
        resultArea = findViewById(R.id.resultArea)

        calculateButton.setOnClickListener {
            calculateVolumeAndArea()
        }
    }

    private fun calculateVolumeAndArea() {
        val length = lengthInput.text.toString().toDoubleOrNull() ?: 0.0
        val width = widthInput.text.toString().toDoubleOrNull() ?: 0.0
        val height = heightInput.text.toString().toDoubleOrNull() ?: 0.0

        val volume = length * width * height
        val area = 2 * (length * width + width * height + height * length)

        resultVolume.text = "Volume: %.2f cm³".format(volume)
        resultArea.text = "Luas: %.2f cm²".format(area)
    }
}
