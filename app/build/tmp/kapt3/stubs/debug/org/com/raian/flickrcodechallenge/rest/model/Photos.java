package org.com.raian.flickrcodechallenge.rest.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lorg/com/raian/flickrcodechallenge/rest/model/Photos;", "", "()V", "page", "", "getPage", "()Ljava/lang/Long;", "setPage", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "pages", "getPages", "setPages", "perpage", "getPerpage", "setPerpage", "photo", "", "Lorg/com/raian/flickrcodechallenge/rest/model/Photo;", "getPhoto", "()Ljava/util/List;", "setPhoto", "(Ljava/util/List;)V", "total", "", "getTotal", "()Ljava/lang/String;", "setTotal", "(Ljava/lang/String;)V", "app_debug"})
public final class Photos {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "page")
    private java.lang.Long page;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "pages")
    private java.lang.Long pages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "perpage")
    private java.lang.Long perpage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total")
    private java.lang.String total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "photo")
    private java.util.List<org.com.raian.flickrcodechallenge.rest.model.Photo> photo;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPages() {
        return null;
    }
    
    public final void setPages(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPerpage() {
        return null;
    }
    
    public final void setPerpage(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.com.raian.flickrcodechallenge.rest.model.Photo> getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.Nullable()
    java.util.List<org.com.raian.flickrcodechallenge.rest.model.Photo> p0) {
    }
    
    public Photos() {
        super();
    }
}