package com.bootcamp.stations.favorite.domain

import android.util.Log
import com.bootcamp.stations.favorite.datalyer.FavoriteRepositry
import com.bootcamp.stations.favorite.model.FavoriteModel
import com.bootcamp.stations.user.model.UserModel
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AddToFavoriteUseCase(private val favoriteRepositry: FavoriteRepositry) {

suspend operator fun invoke(markerId: String, title: String, location: LatLng)
= withContext(Dispatchers.IO){


        favoriteRepositry.getFavorite().collect {

        val favoriteList = it.toMutableList()


        favoriteList.add(FavoriteModel(markerId,
            mapOf("latitude" to location.latitude,"longitude" to location.longitude ),
            title,true))

        favoriteRepositry.setfavorite(favoriteList)
    }
  }
}