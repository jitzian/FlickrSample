package org.com.raian.flickrcodechallenge.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0 J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u0016\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006)"}, d2 = {"Lorg/com/raian/flickrcodechallenge/ui/viewmodel/DisplayFetchedDataViewModel;", "Lorg/com/raian/flickrcodechallenge/ui/viewmodel/BaseViewModel;", "db", "Lorg/com/raian/flickrcodechallenge/constans/database/FlickerDataBase;", "context", "Landroid/content/Context;", "(Lorg/com/raian/flickrcodechallenge/constans/database/FlickerDataBase;Landroid/content/Context;)V", "injector", "error/NonExistentClass", "Lerror/NonExistentClass;", "listOfDataForUI", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/com/raian/flickrcodechallenge/constans/model/FlickerDataClass;", "getListOfDataForUI", "()Landroidx/lifecycle/MutableLiveData;", "listOfDataForUI$delegate", "Lkotlin/Lazy;", "restApi", "Lorg/com/raian/flickrcodechallenge/rest/RestApi;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "checkLocalData", "", "input", "", "clearLocalData", "Lkotlinx/coroutines/Job;", "Landroidx/lifecycle/LiveData;", "getStoredDataForUI", "inject", "insertDataIntoDb", "response", "Lretrofit2/Response;", "Lorg/com/raian/flickrcodechallenge/rest/model/FlickrResultApi;", "prepareRemoteData", "query", "app_debug"})
public final class DisplayFetchedDataViewModel extends org.com.raian.flickrcodechallenge.ui.viewmodel.BaseViewModel {
    private final kotlin.Lazy listOfDataForUI$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public retrofit2.Retrofit retrofit;
    private final error.NonExistentClass injector = null;
    private org.com.raian.flickrcodechallenge.rest.RestApi restApi;
    private final org.com.raian.flickrcodechallenge.constans.database.FlickerDataBase db = null;
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> getListOfDataForUI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    private final void inject() {
    }
    
    public final void checkLocalData(@org.jetbrains.annotations.Nullable()
    java.lang.String input) {
    }
    
    private final kotlinx.coroutines.Job prepareRemoteData(java.lang.String query) {
        return null;
    }
    
    private final kotlinx.coroutines.Job insertDataIntoDb(retrofit2.Response<org.com.raian.flickrcodechallenge.rest.model.FlickrResultApi> response) {
        return null;
    }
    
    private final kotlinx.coroutines.Job getStoredDataForUI() {
        return null;
    }
    
    private final kotlinx.coroutines.Job clearLocalData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> getListOfDataForUI() {
        return null;
    }
    
    public DisplayFetchedDataViewModel(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.constans.database.FlickerDataBase db, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}