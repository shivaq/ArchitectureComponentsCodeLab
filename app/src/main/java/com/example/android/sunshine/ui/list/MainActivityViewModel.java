package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListWeatherEntry;
import java.util.List;

/**
 * Created by Yasuaki on 2018/01/14.
 */

public class MainActivityViewModel extends ViewModel {

  private SunshineRepository repository;
  private final LiveData<List<ListWeatherEntry>> weatherList;

  public MainActivityViewModel(SunshineRepository repository) {
    this.repository = repository;
    weatherList = repository.getCurrentWeatherForecasts();
  }

  public LiveData<List<ListWeatherEntry>> getCurrentWeatherForecasts() {
    return weatherList;
  }
}
