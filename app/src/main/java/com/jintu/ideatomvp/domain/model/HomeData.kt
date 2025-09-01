package com.jintu.ideatomvp.domain.model





data class HomeItem(
    val id:String,
    val title:String,
    val imageUrl:String
)

data class HomeData(
    val foodItems:List<HomeItem>,
    val servicesItems:List<HomeItem>,
    val addonsItems:List<HomeItem>
)
