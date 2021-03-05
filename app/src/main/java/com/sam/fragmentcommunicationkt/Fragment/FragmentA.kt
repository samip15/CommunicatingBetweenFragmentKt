package com.sam.fragmentcommunicationkt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.sam.fragmentcommunicationkt.Communicator
import com.sam.fragmentcommunicationkt.R

class FragmentA : Fragment() {
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_a, container, false)
        communicator = activity as Communicator
        val sendBtn = view.findViewById<Button>(R.id.send_btn)
        val msgInput = view.findViewById<EditText>(R.id.messgae_input)
        sendBtn.setOnClickListener {
            communicator.passDataCom(msgInput.text.toString())
        }
        return view
    }
}