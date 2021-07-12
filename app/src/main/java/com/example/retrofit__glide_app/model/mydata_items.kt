package com.example.retrofit__glide_app.model


//this class is used as a main Structure

// when Http sends a data statelessly then this data is taken/landed as a series-wise
//by this class and interface



//mkae sure you are writing or declaring the variables as per the data is coming
//otherwise the data creates confliction


data class mydata_items
(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String

)


/*
we are going to fetch below sample data
 from URL =  https://jsonplaceholder.typicode.com/posts/1

{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}


 */