package developer.shivam.joyplayer.ui.home

import developer.shivam.joyplayer.ui.BasePresenter
import javax.inject.Inject

/*
 * Created by shivam on 21/6/17.
 */
class HomePresenter<T: HomeMvpView> @Inject constructor() : BasePresenter<T>(), HomeMvpPresenter<T> {

    override fun fetchSongs() {
        getMvpView()?.setSongsList()
    }
}