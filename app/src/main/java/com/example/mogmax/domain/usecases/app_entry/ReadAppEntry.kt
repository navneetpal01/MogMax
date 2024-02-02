package com.example.mogmax.domain.usecases.app_entry

import com.example.mogmax.domain.model.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke() : Flow<Boolean>{
       return localUserManager.readAppEntry()
    }
}