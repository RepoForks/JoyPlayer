package developer.shivam.joyplayer.ui.home

import developer.shivam.joyplayer.ui.MvpPresenter
import javax.inject.Inject

/*
 * Created by shivam on 21/6/17.
 */
interface HomeMvpPresenter<T: HomeMvpView> : MvpPresenter<T> {

    fun fetchSongs()
}