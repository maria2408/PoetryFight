package com.mycompany.poetryfight.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mycompany.poetryfight.R
import com.mycompany.poetryfight.ui.dashboard.DashboardViewModel

class HelpFragment : Fragment() {
    private lateinit var helpViewModel: HelpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        helpViewModel =
            ViewModelProvider(this).get(HelpViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_help, container, false)

        val textView1: TextView = root.findViewById(R.id.text_help)
        helpViewModel.text.observe(viewLifecycleOwner, Observer {
            textView1.text = it
        })

        val textView2: TextView = root.findViewById(R.id.text_help2)
        helpViewModel.text2.observe(viewLifecycleOwner, Observer {
            textView2.text = it
        })

        val textView3: TextView = root.findViewById(R.id.text_help3)
        helpViewModel.text3.observe(viewLifecycleOwner, Observer {
            textView3.text = it
        })
        return root
    }
}