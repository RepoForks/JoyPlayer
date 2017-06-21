package developer.shivam.joyplayer.ui

/*
 * Created by shivam on 21/6/17.
 */
interface MvpPresenter<T> {

    fun setMvpView(view: T)

    fun removeMvpView()

}