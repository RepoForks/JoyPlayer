package developer.shivam.joyplayer.injection.component

import dagger.Component
import developer.shivam.joyplayer.injection.module.ActivityModule
import developer.shivam.joyplayer.ui.home.HomeActivity

/*
 * Created by shivam on 21/6/17.
 */
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent {

    fun inject(activity: HomeActivity)
}