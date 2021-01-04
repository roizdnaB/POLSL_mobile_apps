package com.example.courseviewer.model

import androidx.room.TypeConverter
import java.util.*

public class DateConverters {

    //https://developer.android.com/training/data-storage/room/referencing-data
    @TypeConverter
    public fun convertToDate(x: Long?): Date? {
        return x?.let {Date(it)}
    }

    @TypeConverter
    public fun convertToLong(x: Date?): Long? {
        return x?.time
    }
}