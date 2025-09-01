import com.jintu.ideatomvp.data.api.HomeApiService
import com.jintu.ideatomvp.data.api.ItemDto
import com.jintu.ideatomvp.domain.model.HomeData
import com.jintu.ideatomvp.domain.model.HomeItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class HomeRepository (private val apiService: HomeApiService){

    fun getHomeData(): Flow<HomeData> {
        return flow{
            val dto=apiService.getHomeData()
            val homeData= HomeData(
                foodItems = dto.foodSection.map{it.toDomainModel()},
                servicesItems = dto.servicesSection.map{it.toDomainModel()},
                addonsItems = dto.addonSection.map{it.toDomainModel()}
            )
            emit(homeData)

        }

    }


}

fun ItemDto.toDomainModel():HomeItem{
    return HomeItem(
        id=this.id,
        title=this.name,
        imageUrl=this.imageUrl
    )
}