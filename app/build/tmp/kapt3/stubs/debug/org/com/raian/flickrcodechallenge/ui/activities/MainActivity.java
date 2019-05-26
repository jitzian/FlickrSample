package org.com.raian.flickrcodechallenge.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000bH\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/com/raian/flickrcodechallenge/ui/activities/MainActivity;", "Lorg/com/raian/flickrcodechallenge/ui/activities/BaseActivity;", "Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver$NetworkListener;", "()V", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "rvCustomAdapter", "Lorg/com/raian/flickrcodechallenge/ui/adapter/RVCustomAdapter;", "getNetworkStatus", "", "isConnected", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "prepareObservers", "app_debug"})
public final class MainActivity extends org.com.raian.flickrcodechallenge.ui.activities.BaseActivity implements org.com.raian.flickrcodechallenge.util.NetworkReceiver.NetworkListener {
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private androidx.recyclerview.widget.GridLayoutManager layoutManager;
    private org.com.raian.flickrcodechallenge.ui.adapter.RVCustomAdapter rvCustomAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initViews() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void prepareObservers() {
    }
    
    @java.lang.Override()
    public void getNetworkStatus(boolean isConnected) {
    }
    
    public MainActivity() {
        super();
    }
}