package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.progra32022.activity.BasicFragment.Companion.HOBIE_PARAM
import com.example.progra32022.activity.BasicFragment.Companion.NAME_PARAM
import com.example.progra32022.databinding.ActivityBasicFragmentBinding

class BasicFragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBasicFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = bundleOf(NAME_PARAM to "Hugo", HOBIE_PARAM to "Trainer")

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BasicFragment>(binding.fragmentContainer2.id, args = bundle)
        }

    }
}