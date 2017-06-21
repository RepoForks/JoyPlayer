package developer.shivam.joyplayer.injection.component

import dagger.Component
import developer.shivam.joyplayer.BaseApplication
import developer.shivam.joyplayer.injection.module.ApplicationModule

/*
 * Created by shivam on 21/6/17.
 */
@Component(
        modules = arrayOf(ApplicationModule::class)
)
interface ApplicationComponent {

    fun inject(application: BaseApplication)
}