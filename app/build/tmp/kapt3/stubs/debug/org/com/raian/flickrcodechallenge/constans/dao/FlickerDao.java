package org.com.raian.flickrcodechallenge.constans.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lorg/com/raian/flickrcodechallenge/constans/dao/FlickerDao;", "", "deleteAll", "", "getAll", "", "Lorg/com/raian/flickrcodechallenge/constans/model/FlickerDataClass;", "getById", "id", "", "insert", "flickerDataClass", "app_debug"})
public abstract interface FlickerDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass flickerDataClass);
    
    @androidx.room.Query(value = "DELETE FROM flicker")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flicker ORDER BY id ASC")
    public abstract java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flicker WHERE id = (:id)")
    public abstract org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass getById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}