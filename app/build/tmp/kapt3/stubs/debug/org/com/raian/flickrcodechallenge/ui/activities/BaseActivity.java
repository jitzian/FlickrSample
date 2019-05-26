package org.com.raian.flickrcodechallenge.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u0006\u0010\u001f\u001a\u00020\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/com/raian/flickrcodechallenge/ui/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver$NetworkListener;", "()V", "TAG", "", "getTAG$app_debug", "()Ljava/lang/String;", "setTAG$app_debug", "(Ljava/lang/String;)V", "displayFetchedDataViewModel", "Lorg/com/raian/flickrcodechallenge/ui/viewmodel/DisplayFetchedDataViewModel;", "getDisplayFetchedDataViewModel$app_debug", "()Lorg/com/raian/flickrcodechallenge/ui/viewmodel/DisplayFetchedDataViewModel;", "displayFetchedDataViewModel$delegate", "Lkotlin/Lazy;", "logger", "Ljava/util/logging/Logger;", "getLogger$app_debug", "()Ljava/util/logging/Logger;", "setLogger$app_debug", "(Ljava/util/logging/Logger;)V", "mSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "networkReceiver", "Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver;", "initViews", "", "onDestroy", "onStart", "onStop", "showNoConnectivityMessage", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements org.com.raian.flickrcodechallenge.util.NetworkReceiver.NetworkListener {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String TAG;
    @org.jetbrains.annotations.NotNull()
    public java.util.logging.Logger logger;
    private com.google.android.material.snackbar.Snackbar mSnackBar;
    private org.com.raian.flickrcodechallenge.util.NetworkReceiver networkReceiver;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy displayFetchedDataViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG$app_debug() {
        return null;
    }
    
    public final void setTAG$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.logging.Logger getLogger$app_debug() {
        return null;
    }
    
    public final void setLogger$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.logging.Logger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.com.raian.flickrcodechallenge.ui.viewmodel.DisplayFetchedDataViewModel getDisplayFetchedDataViewModel$app_debug() {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public final void showNoConnectivityMessage() {
    }
    
    public abstract void initViews();
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity() {
        super();
    }
}