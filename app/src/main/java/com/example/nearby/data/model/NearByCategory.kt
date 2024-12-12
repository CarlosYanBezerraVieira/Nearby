package com.example.nearby.data.model
import  androidx.annotation.DrawableRes

data class NearByCategory(
    val id:String,
    val name:String,
)
{
    @get: DrawableRes
    val icon : Int?
        get() = NearbyCategoryFilterChipView.fromDescription(description = name)?.icon
}
