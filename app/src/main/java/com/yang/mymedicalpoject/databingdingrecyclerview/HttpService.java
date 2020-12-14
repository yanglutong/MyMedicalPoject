package com.yang.mymedicalpoject.databingdingrecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HttpService {

    @GET("banner/json")
    Call<Bean> getCook();

}
