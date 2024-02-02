package com.example.mogmax.domain.usecases.app_entry

import com.example.mogmax.data.manager.LocalUserManagerImpl
import com.example.mogmax.domain.model.LocalUserManager

class SaveAppEntry(
   private val localUserManager: LocalUserManager
){
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}