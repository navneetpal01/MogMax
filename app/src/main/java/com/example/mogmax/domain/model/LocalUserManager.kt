package com.example.mogmax.domain.model

import kotlinx.coroutines.flow.Flow


interface LocalUserManager {
    suspend fun saveAppEntry()
    fun readAppEntry() : Flow<Boolean>
}