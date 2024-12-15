package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Rule
import kotlinx.serialization.Serializable

@Serializable
data class MarketDetails(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val rules: List<Rule>,
    val coupons: Int,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String,
)