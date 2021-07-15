package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationdemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.btnLogin.setOnClickListener() {
            val inputUsername :String = binding.textViewUserName.text.toString()
            val inputPassword :String = binding.textViewPass.text.toString()

            if (inputUsername == "krysty" && inputPassword == "asdf1234") {
                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionsFragment)
            }
            else {
                Toast.makeText(context, "Invalid Username or Password! Please enter again.", Toast.LENGTH_LONG).show()
            }
        }

        /*val button : Button = view.findViewById(R.id.btn_Login)
        button.setOnClickListener() {
        }*/

        return view
    }
}