package com.example.android.sunshine.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import java.util.Date;
import java.util.List;

/**
 * Created by Yasuaki on 2018/01/13.
 */
@Dao
public interface WeatherDao {

  // リモートからデータを取得した際、古いデータを置換する
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  void bulkInsert(WeatherEntry... weather);

  @Query("SELECT * FROM weather WHERE date = :date")
  LiveData<WeatherEntry> getWeatherByDate(Date date);

  @Query("SELECT COUNT(id) FROM weather WHERE date >= :date")
  int countAllFutureWeather(Date date);

  @Query("DELETE FROM weather WHERE date < :date")
  void deleteOldData(Date date);

  @Query("Select id,weatherIconId,date,min,max from weather WHERE date >= :date")
  LiveData<List<ListWeatherEntry>> getCurrentWeatherForecasts(Date date);
}
