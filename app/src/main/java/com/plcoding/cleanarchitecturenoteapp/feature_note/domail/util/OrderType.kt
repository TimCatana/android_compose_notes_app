package com.plcoding.cleanarchitecturenoteapp.feature_note.domail.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
