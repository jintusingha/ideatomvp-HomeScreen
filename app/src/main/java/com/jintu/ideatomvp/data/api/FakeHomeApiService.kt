import com.jintu.ideatomvp.data.api.HomeApiService
import com.jintu.ideatomvp.data.api.HomeDataDto
import com.jintu.ideatomvp.data.api.ItemDto


// In file: com/ideatomvp/app/data/api/FakeHomeApiService.kt

// This class "implements" the HomeApiService contract.
class FakeHomeApiService : HomeApiService {
    override fun getHomeData(): HomeDataDto {
        // This is your hardcoded "JSON" response.
        return HomeDataDto(
            foodSection = listOf(
                ItemDto(
                    "1",
                    "Snacks",
                    "https://images.unsplash.com/photo-1627448371190-84c1f9c0e4f3"
                ),
                ItemDto("2", "Local Meals", "https://images.unsplash.com/photo-1546069901-d820b12c8b82"),
                ItemDto("3", "Drinks", "https://images.unsplash.com/photo-1534353435-a130f40d6c4d")
            ),
            servicesSection = listOf(
                ItemDto("4", "Guided Treks", "https://images.unsplash.com/photo-1518063737505-c471d871b692"),
                ItemDto("5", "Bike Rentals", "https://images.unsplash.com/photo-1517454238580-0082c3c5f111"),
                ItemDto("6", "Room Service", "https://images.unsplash.com/photo-1517841905240-472988babdf9")
            ),
            addonSection = listOf(
                ItemDto("7", "Towel", "https://images.unsplash.com/photo-1518063737505-c471d871b692"),
                ItemDto("8", "Dryer", "https://images.unsplash.com/photo-1517454238580-0082c3c5f111"),
                ItemDto("9", "Ironing", "https://images.unsplash.com/photo-1517841905240-472988babdf9")
            )
        )
    }
}