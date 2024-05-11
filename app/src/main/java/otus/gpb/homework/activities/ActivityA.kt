package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

val TAG: String = "TAG"

class ActivityA : AppCompatActivity() {

    private var buttonToB: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        buttonToB = findViewById(R.id.button_a)
        buttonToB?.setOnClickListener {
            intent = Intent(this, ActivityB::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intent)
//            startActivity(Intent(this, ActivityB::class.java))
        }
//        Log.i(TAG, "${javaClass.simpleName}: ${object {}.javaClass.enclosingMethod?.name}")
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