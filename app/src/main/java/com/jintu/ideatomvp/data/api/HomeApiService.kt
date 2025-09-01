package com.jintu.ideatomvp.data.api



// baiscally we will write the strucutre of how the data will looklik in this
// dto data transfer object mimics the raw json from an api




data class ItemDto(
    val id:String,
    val name:String,
    val imageUrl:String
)


data class HomeDataDto(
    val foodSection:List<ItemDto>,
    val servicesSection:List<ItemDto>,
    val addonSection:List<ItemDto>
)

// now this is the interface defining what the api services must do
interface HomeApiService{
    fun getHomeData(): HomeDataDto
}