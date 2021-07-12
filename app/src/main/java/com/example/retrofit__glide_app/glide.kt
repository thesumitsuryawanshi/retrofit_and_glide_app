package com.example.retrofit__glide_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.bumptech.glide.Glide
import com.example.retrofit__glide_app.databinding.FragmentGlideBinding


class glide : Fragment() {

private var binding:FragmentGlideBinding? = null
    private var url = "https://www.pikpng.com/pngl/m/85-856889_bugs-makes-a-silly-face-even-though-hes.png"


//--------------------------------------------------------------------------------------------------

    // TODO: hello brother this is new TODO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

//--------------------------------------------------------------------------------------------------

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        binding = FragmentGlideBinding.inflate(inflater,container,false)
        return  binding!!.root
    }


//--------------------------------------------------------------------------------------------------
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    binding!!.btnLoadImg.setOnClickListener(){

        Glide.with(this).load(url).placeholder(R.drawable.ic_launcher_background).into(binding!!.imgViewForLoadingImg)

        Toast.makeText(context, "Wait a min.   Im loading the img", Toast.LENGTH_SHORT).show()

       }

    }

//--------------------------------------------------------------------------------------------------

}