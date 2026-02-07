package com.example.islamic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.databinding.ActivityMainBinding
import com.example.islamic.databinding.FragmentSebhaBinding

class Sebha : Fragment() {
     var countstart=1
    var bigcounter=1

    private var _binding: FragmentSebhaBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
       _binding= FragmentSebhaBinding.inflate(inflater, container, false)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sebhabody.setOnClickListener { binding.sebhabody.animate()
            .rotationBy(10f)
            .setDuration(100)
            .start()
//            binding.counter.text="$countstart"
//            countstart++
            init()
        }
    }
    fun init()
    {if (bigcounter<=31)
    {        binding.sebhawords.text="سبحان الله"

        binding.counter.text="$countstart"
        countstart++
    bigcounter++
//    if (bigcounter==31)countstart=1
    }
        else if (bigcounter<=62)
    {  if (countstart==32)countstart=1
        binding.sebhawords.text="الحمد لله"
        binding.counter.text="$countstart"
        countstart++
        bigcounter++
        }
    else if (bigcounter<=93)
    { if (countstart==32)countstart=1
        binding.sebhawords.text="الله اكبر"
        binding.counter.text="$countstart"
        countstart++
        bigcounter++
    }
    else if (bigcounter>93)
    {
        binding.sebhawords.text="لا اله الا الله"
        binding.counter.text=""
        countstart=1
        bigcounter=1
    }




    }
}


