package org.com.raian.flickrcodechallenge.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\b"}, d2 = {"Lorg/com/raian/flickrcodechallenge/rest/RestApi;", "", "fetRemoteData", "Lretrofit2/Call;", "Lorg/com/raian/flickrcodechallenge/rest/model/FlickrResultApi;", "queryMap", "", "", "app_debug"})
public abstract interface RestApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/services/rest/")
    public abstract retrofit2.Call<org.com.raian.flickrcodechallenge.rest.model.FlickrResultApi> fetRemoteData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> queryMap);
}