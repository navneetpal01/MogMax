package com.example.mogmax.di

import android.app.Application
import android.app.Notification.VISIBILITY_PUBLIC
import android.app.NotificationChannel
import android.app.NotificationManager
import android.opengl.Visibility
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NotificationModule {

    @Singleton
    @Provides
    fun providesNotificationBuilder(
        application : Application
    ) : NotificationCompat.Builder {
        return NotificationCompat.Builder(application,"Main Channel Id")
            .setContentTitle("Hair Cut")
            .setContentText("Today is the day for Hair Cut")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
    }

    @Singleton
    @Provides
    fun providesNotificationManager(
        application: Application
    ) : NotificationManagerCompat {
        val notificationManager = NotificationManagerCompat.from(application)
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                "Main Channel Id",
                "Main Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }
        return notificationManager
    }
}