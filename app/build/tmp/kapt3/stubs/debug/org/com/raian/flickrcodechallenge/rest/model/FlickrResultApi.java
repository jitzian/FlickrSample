package org.com.raian.flickrcodechallenge.rest.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/com/raian/flickrcodechallenge/rest/model/FlickrResultApi;", "", "()V", "photos", "Lorg/com/raian/flickrcodechallenge/rest/model/Photos;", "getPhotos", "()Lorg/com/raian/flickrcodechallenge/rest/model/Photos;", "setPhotos", "(Lorg/com/raian/flickrcodechallenge/rest/model/Photos;)V", "stat", "", "getStat", "()Ljava/lang/String;", "setStat", "(Ljava/lang/String;)V", "app_debug"})
public final class FlickrResultApi {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "photos")
    private org.com.raian.flickrcodechallenge.rest.model.Photos photos;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "stat")
    private java.lang.String stat;
    
    @org.jetbrains.annotations.Nullable()
    public final org.com.raian.flickrcodechallenge.rest.model.Photos getPhotos() {
        return null;
    }
    
    public final void setPhotos(@org.jetbrains.annotations.Nullable()
    org.com.raian.flickrcodechallenge.rest.model.Photos p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStat() {
        return null;
    }
    
    public final void setStat(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public FlickrResultApi() {
        super();
    }
}