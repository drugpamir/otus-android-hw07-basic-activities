package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    private var buttonToC: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        buttonToC = findViewById(R.id.button_b)
        buttonToC?.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
        Log.i(TAG, "${javaClass.simpleName}: onCreate")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(TAG, "${javaClass.simpleName}: onNewIntent")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "${javaClass.simpleName}: onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "${javaClass.simpleName}: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "${javaClass.simpleName}: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "${javaClass.simpleName}: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "${javaClass.simpleName}: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "${javaClass.simpleName}: onDestroy")
    }
}