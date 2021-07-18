package com.example.retrofit__glide_app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit__glide_app.MyAdapter.AdapterForRecyclerView
import com.example.retrofit__glide_app.databinding.FragmentRetrofitBinding
import com.example.retrofit__glide_app.model.API_interface
import com.example.retrofit__glide_app.model.mydata_items
import kotlinx.android.synthetic.main.fragment_retrofit.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Retrofit : Fragment() {


    private var binding: FragmentRetrofitBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding = FragmentRetrofitBinding.inflate(inflater, container, false)
        return binding!!.root


    }


    //--------------------------------------------------------------------------------------------------
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val numbers:Array<String> = arrayOf("one","two","three","four","five","Six","Seven","Eight","Nine","Ten","Eleven","Tweelve","third-teen","four-teen","fifteen","six-teen","Seven-teen");

        val adapter = AdapterForRecyclerView(numbers)

        myrecyclerView.layoutManager = LinearLayoutManager(requireContext())
        myrecyclerView.adapter = adapter



        //make sure you are adding '/'  in BASE_URL otherwise it wont work

        val BASE_URL = "https://jsonplaceholder.typicode.com/"

        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(API_interface::class.java)

        val retrofit_data = retrofitBuilder.getdata()


//there a simple shortcut to find the most desirable Code req. for the func.
//  Ctrl+ shift + space

        retrofit_data.enqueue(object : Callback<List<mydata_items>?> {
            override fun onResponse(
                call: Call<List<mydata_items>?>,
                response: Response<List<mydata_items>?>
            ) {

                val responseBody = response.body()!!

                val MyStringBuidler = StringBuilder()

                for (my_fetched_data in responseBody) {
                    MyStringBuidler.append(my_fetched_data.id)
                    MyStringBuidler.append("-")
                }

                Toast.makeText(context, "$MyStringBuidler", Toast.LENGTH_SHORT).show()

                Log.d("mytag", "lets see this works or not ")
//                binding!!.textViewForDisplayingData.text = MyStringBuidler


            }

            override fun onFailure(call: Call<List<mydata_items>?>, t: Throwable) {
                Log.d("retrofit_issue", "onFailure : " + t.message)
            }
        })

binding!!.btnToLoadData.setOnClickListener{
    Toast.makeText(context, "hey baby this is working . ( ahh ha )  :) ", Toast.LENGTH_SHORT).show()
}

    }
//--------------------------------------------------------------------------------------------------


}