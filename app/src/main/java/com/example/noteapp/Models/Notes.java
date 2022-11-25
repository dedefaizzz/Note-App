package com.example.noteapp.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "notes")    // nama tabel
public class Notes implements Serializable {

    @PrimaryKey(autoGenerate = true)     // men generate otomatis mjd primary key
    int ID = 0;

    @ColumnInfo(name = "title")
    String title = "";

    @ColumnInfo(name = "notes")
    String notes = "";

    @ColumnInfo(name = "date")
    String date = "";

    @ColumnInfo(name = "pinned")
    boolean pinned = false;
}
