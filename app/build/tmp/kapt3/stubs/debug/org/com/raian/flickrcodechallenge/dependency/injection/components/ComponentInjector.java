package org.com.raian.flickrcodechallenge.dependency.injection.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/com/raian/flickrcodechallenge/dependency/injection/components/ComponentInjector;", "", "inject", "", "displayFetchedDataViewModel", "Lorg/com/raian/flickrcodechallenge/ui/viewmodel/DisplayFetchedDataViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {org.com.raian.flickrcodechallenge.dependency.injection.modules.NetworkModule.class})
public abstract interface ComponentInjector {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    org.com.raian.flickrcodechallenge.ui.viewmodel.DisplayFetchedDataViewModel displayFetchedDataViewModel);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/com/raian/flickrcodechallenge/dependency/injection/components/ComponentInjector$Builder;", "", "build", "Lorg/com/raian/flickrcodechallenge/dependency/injection/components/ComponentInjector;", "networkModule", "Lorg/com/raian/flickrcodechallenge/dependency/injection/modules/NetworkModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.com.raian.flickrcodechallenge.dependency.injection.components.ComponentInjector build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.com.raian.flickrcodechallenge.dependency.injection.components.ComponentInjector.Builder networkModule(@org.jetbrains.annotations.NotNull()
        org.com.raian.flickrcodechallenge.dependency.injection.modules.NetworkModule networkModule);
    }
}