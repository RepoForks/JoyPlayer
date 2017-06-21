package developer.shivam.joyplayer.ui

import android.support.v7.app.AppCompatActivity
import developer.shivam.joyplayer.BaseApplication
import developer.shivam.joyplayer.injection.component.ActivityComponent
import developer.shivam.joyplayer.injection.component.DaggerActivityComponent
import developer.shivam.joyplayer.injection.module.ActivityModule

/*
 * Created by shivam on 21/6/17.
 */
open class BaseActivity: AppCompatActivity() {

    var activityComponent: ActivityComponent? = null;

    fun getComponent(): ActivityComponent? {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(BaseApplication.get(this).getComponent())
                    .activityModule(ActivityModule(this))
                    .build()
        }

        return activityComponent;
    }
}
