package developer.shivam.joyplayer.ui.home

import android.os.Bundle
import developer.shivam.joyplayer.R
import developer.shivam.joyplayer.ui.BaseActivity

class HomeActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        getComponent()?.inject(this)
    }
}
