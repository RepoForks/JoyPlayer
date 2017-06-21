package developer.shivam.joyplayer

import android.app.Application
import developer.shivam.joyplayer.injection.component.ApplicationComponent
import developer.shivam.joyplayer.injection.component.DaggerApplicationComponent
import developer.shivam.joyplayer.injection.module.ApplicationModule

/*
 * Created by shivam on 21/6/17.
 */
class BaseApplication: Application() {

    var applicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        if (applicationComponent == null) {
            applicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(ApplicationModule(this))
                    .build()
        }
    }
}