package com.dev.instagramuz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.dev.instagramuz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        adapter = RecyclerAdapter()
//        adapter2 = RecyclerAdapter2()
//        recycler2.adapter = adapter2
//        recycler.adapter = adapter
        transparentFragment(Fragment1())
        binding.btn.setOnClickListener {
            transparentFragment(Fragment1())
        }
        binding.btn2.setOnClickListener {
            transparentFragment(Fragment2())
        }
        binding.btn3.setOnClickListener {
            transparentFragment(Fragment3())
        }
        binding.btn4.setOnClickListener {
            transparentFragment(Fragment4())
        }
        binding.btn5.setOnClickListener {
            transparentFragment(Fragmen5())
        }
    }

    private fun transparentFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content,fragment)
        fragmentTransaction.commit()
    }
}

