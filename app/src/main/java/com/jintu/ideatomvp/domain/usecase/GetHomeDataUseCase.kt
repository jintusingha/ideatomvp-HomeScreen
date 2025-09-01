package com.jintu.ideatomvp.domain.usecase

import HomeRepository
import com.jintu.ideatomvp.domain.model.HomeData
import kotlinx.coroutines.flow.Flow


class GetHomeDataUseCase (private val repository: HomeRepository){
    operator fun invoke(): Flow<HomeData>{
        return repository.getHomeData()
    }

}