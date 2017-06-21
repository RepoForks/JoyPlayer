package developer.shivam.joyplayer.ui.home

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.Toast
import developer.shivam.joyplayer.R
import developer.shivam.joyplayer.ui.BaseActivity
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeMvpView {

    @Inject
    lateinit var presenter: HomePresenter<HomeMvpView>

    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var toolbar: Toolbar
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        setupNavigationDrawer()

        getComponent()?.inject(this)
        presenter.setMvpView(this)

        button.setOnClickListener {
            presenter.fetchSongs()
        }
    }

    fun init() {
        drawerLayout = findViewById(R.id.drawer_layout) as DrawerLayout
        navigationView = findViewById(R.id.navigation_view) as NavigationView

        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        button = findViewById(R.id.btn_fetch_songs) as Button
    }

    fun setupNavigationDrawer() {
        var actionBarDrawerToggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.open,
                R.string.close
        )

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }

    override fun setSongsList() {
        Toast.makeText(this, "Method called", Toast.LENGTH_SHORT).show()
    }
}
