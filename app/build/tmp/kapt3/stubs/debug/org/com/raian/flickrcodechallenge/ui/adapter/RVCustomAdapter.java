package org.com.raian.flickrcodechallenge.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lorg/com/raian/flickrcodechallenge/ui/adapter/RVCustomAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/com/raian/flickrcodechallenge/ui/adapter/RVCustomAdapter$ViewHolder;", "context", "Landroid/content/Context;", "lstRes", "Landroidx/lifecycle/LiveData;", "", "Lorg/com/raian/flickrcodechallenge/constans/model/FlickerDataClass;", "(Landroid/content/Context;Landroidx/lifecycle/LiveData;)V", "getLstRes", "()Landroidx/lifecycle/LiveData;", "setLstRes", "(Landroidx/lifecycle/LiveData;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RVCustomAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.com.raian.flickrcodechallenge.ui.adapter.RVCustomAdapter.ViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> lstRes;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.com.raian.flickrcodechallenge.ui.adapter.RVCustomAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.ui.adapter.RVCustomAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> getLstRes() {
        return null;
    }
    
    public final void setLstRes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> p0) {
    }
    
    public RVCustomAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass>> lstRes) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/com/raian/flickrcodechallenge/ui/adapter/RVCustomAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/com/raian/flickrcodechallenge/ui/adapter/RVCustomAdapter;Landroid/view/View;)V", "mImageViewPhoto", "Landroid/widget/ImageView;", "bindData", "", "flickerDataClass", "Lorg/com/raian/flickrcodechallenge/constans/model/FlickerDataClass;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView mImageViewPhoto = null;
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass flickerDataClass) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}