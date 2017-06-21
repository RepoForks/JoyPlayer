package developer.shivam.joyplayer.ui.home

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import developer.shivam.joyplayer.R
import developer.shivam.joyplayer.ui.BaseActivity
import javax.inject.Inject

class HomeActivity: BaseActivity(), HomeMvpView {

    @Inject
    lateinit var presenter: HomePresenter<HomeMvpView>

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()

        getComponent()?.inject(this)
        presenter.setMvpView(this)

        button.setOnClickListener {
            presenter.fetchSongs()
        }
    }

    fun init() {
        button = findViewById(R.id.btn_fetch_songs) as Button
    }

    override fun setSongsList() {
        Toast.makeText(this, "Method called", Toast.LENGTH_SHORT).show()
    }
}
