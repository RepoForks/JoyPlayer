package developer.shivam.joyplayer.ui

/*
 * Created by shivam on 21/6/17.
 */
open class BasePresenter<T: MvpView> : MvpPresenter<T> {

    var view: T? = null

    override fun setMvpView(view: T) {
        this.view = view
    }

    override fun removeMvpView() {
        view = null
    }

    fun isViewAttached(): Boolean {
        return view != null
    }

    fun getMvpView(): T? {
        return view
    }

    fun checkViewAttached() {
        if (!isViewAttached()) throw MvpViewNotAttachedException()
    }

    class MvpViewNotAttachedException : RuntimeException("Please call Presenter.attachView(MvpView) before requesting data to the Presenter")
}