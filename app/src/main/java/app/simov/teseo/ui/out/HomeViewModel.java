package app.simov.teseo.ui.out;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("Este es el Fragmento principal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}