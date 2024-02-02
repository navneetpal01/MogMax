package com.example.mogmax.di

import android.app.Application
import com.example.mogmax.data.manager.LocalUserManagerImpl
import com.example.mogmax.domain.model.LocalUserManager
import com.example.mogmax.domain.usecases.app_entry.AppEntryUseCases
import com.example.mogmax.domain.usecases.app_entry.ReadAppEntry
import com.example.mogmax.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ) : LocalUserManager =LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}