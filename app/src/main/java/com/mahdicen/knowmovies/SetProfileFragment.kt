package com.mahdicen.knowmovies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.mahdicen.knowmovies.databinding.FragmentSetProfileBinding

class SetProfileFragment : Fragment() {
    lateinit var binding: FragmentSetProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSetProfileBinding
            .inflate(layoutInflater, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnSetProfile.setOnClickListener {

            if (
                binding.edtEmail.text!!.isNotEmpty() &&
                binding.edtPassword.text!!.isNotEmpty() &&
                binding.edtFavG.text!!.isNotEmpty() &&
                binding.edtFavMovie.text!!.isNotEmpty()
            ) {



            } else {
                Snackbar.make(
                    binding.root,
                    "Fill the Required ones!",
                    Snackbar.LENGTH_LONG
                )
                    .setBackgroundTint(
                        ContextCompat
                        .getColor(requireContext() , R.color.red))
                    .setTextColor(
                        ContextCompat
                        .getColor(requireContext() , R.color.white))
                    .show()
            }

        }

    }
}