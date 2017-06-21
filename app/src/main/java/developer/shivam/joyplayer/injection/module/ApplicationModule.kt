package developer.shivam.joyplayer.injection.module

import android.app.Activity
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import developer.shivam.joyplayer.injection.annotation.ActivityContext

/*
 * Created by shivam on 21/6/17.
 */
@Module
class ApplicationModule(var application: Application) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return application.applicationContext
    }
}