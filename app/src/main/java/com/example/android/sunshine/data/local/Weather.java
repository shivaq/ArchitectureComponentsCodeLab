package com.example.android.sunshine.data.local;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Yasuaki on 2018/01/13.
 */
@Entity(tableName = "weathers")
public class Weather {

  @PrimaryKey
  public int id;
  public int weatherIconId;
  public long date;
  public float min;
  public float max;
  public int humidity;
  public float pressure;
  public float wind;
  public int degrees;


}
