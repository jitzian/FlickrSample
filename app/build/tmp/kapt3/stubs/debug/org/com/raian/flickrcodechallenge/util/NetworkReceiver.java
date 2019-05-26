package org.com.raian.flickrcodechallenge.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver;", "Landroid/content/BroadcastReceiver;", "networkListener", "Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver$NetworkListener;", "(Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver$NetworkListener;)V", "isConnectionAvailable", "", "networkInfo", "Landroid/net/NetworkInfo;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setNetworkListener", "NetworkListener", "app_debug"})
public final class NetworkReceiver extends android.content.BroadcastReceiver {
    private org.com.raian.flickrcodechallenge.util.NetworkReceiver.NetworkListener networkListener;
    
    public final void setNetworkListener(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.util.NetworkReceiver.NetworkListener networkListener) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final boolean isConnectionAvailable(android.net.NetworkInfo networkInfo) {
        return false;
    }
    
    public NetworkReceiver(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.util.NetworkReceiver.NetworkListener networkListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/com/raian/flickrcodechallenge/util/NetworkReceiver$NetworkListener;", "", "getNetworkStatus", "", "isConnected", "", "app_debug"})
    public static abstract interface NetworkListener {
        
        public abstract void getNetworkStatus(boolean isConnected);
    }
}