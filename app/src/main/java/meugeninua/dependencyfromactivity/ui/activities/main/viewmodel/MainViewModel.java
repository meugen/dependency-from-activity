package meugeninua.dependencyfromactivity.ui.activities.main.viewmodel;

import android.text.TextUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<List<String>> itemsLiveData = new MutableLiveData<>();
    private final Random rand = new Random();

    public MainViewModel() {
        itemsLiveData.setValue(Collections.emptyList());
    }

    public LiveData<List<String>> getItemsLiveData() {
        return itemsLiveData;
    }

    public void addItem(final CharSequence item) {
        CharSequence itemToAdd = item;
        if (TextUtils.isEmpty(itemToAdd)) {
            itemToAdd = new BigInteger(100, rand).toString(26);
        }
        List<String> oldItems = itemsLiveData.getValue();
        List<String> newItems = oldItems == null
                ? new ArrayList<>()
                : new ArrayList<>(oldItems);
        newItems.add(itemToAdd.toString());
        itemsLiveData.setValue(newItems);
    }
}
