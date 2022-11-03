package ru.yacevyuk.r.r.company.home_work_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener {
            supportFragmentManager.commit {
                replace<Fragment_SignUp>(R.id.fragment_main)
                setReorderingAllowed(false)
                addToBackStack(null)
            }
        }
        btn.setOnClickListener {
            supportFragmentManager.commit {
                replace<Fragment_Login>(R.id.fragment_main)
                setReorderingAllowed(false)
                addToBackStack(null)
            }
        }
    }
}
