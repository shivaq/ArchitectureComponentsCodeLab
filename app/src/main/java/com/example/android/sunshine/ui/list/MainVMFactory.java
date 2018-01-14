package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import com.example.android.sunshine.data.SunshineRepository;

/**
 * Created by Yasuaki on 2018/01/14.
 */

public class MainVMFactory extends ViewModelProvider.NewInstanceFactory {

  private final SunshineRepository mRepository;

  public MainVMFactory(SunshineRepository mRepository) {
    this.mRepository = mRepository;
  }

  @NonNull
  @Override
  public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
    //noinspection unchecked
    return (T) new MainActivityViewModel(mRepository);
  }
}
