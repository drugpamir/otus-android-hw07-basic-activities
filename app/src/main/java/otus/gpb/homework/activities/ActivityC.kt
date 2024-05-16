package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    private var buttonOpenA: Button? = null
    private var buttonOpenD: Button? = null
    private var buttonCloseC: Button? = null
    private var buttonCloseStack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        buttonOpenA = findViewById(R.id.button_open_a)
        buttonOpenA?.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }

        buttonOpenD = findViewById(R.id.button_open_d)
        buttonOpenD?.setOnClickListener {
            intent = Intent(this, ActivityD::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intent)
        }

        buttonCloseC = findViewById(R.id.button_close_c)
        buttonCloseC?.setOnClickListener {
            finish()
        }

        buttonCloseStack = findViewById(R.id.button_close_stack)
        buttonCloseStack?.setOnClickListener {
            finishAffinity()
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