package lt.arnas.seventhtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "my_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val square01 = Square(5)
        val triangle01 = Triangle(8, 10)
        val circle01 = Circle(4)

        chooseShape(square01)
        chooseShape(triangle01)
        chooseShape(circle01)
    }

    private fun chooseShape(shape: Shape) {
        shape.calculateArea()
        Log.i(TAG, "chooseShape: $shape")
    }


}