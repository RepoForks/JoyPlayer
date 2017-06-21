package developer.shivam.joyplayer.injection.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides

/*
 * Created by shivam on 21/6/17.
 */
@Module
class ActivityModule(var activity: Activity) {

    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideActivity(): Activity {
        return activity
    }
}