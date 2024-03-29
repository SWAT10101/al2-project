package com.example.myapplication.api;




import com.example.myapplication.models.LoginResponse;
import com.example.myapplication.models.RegionModel;
import com.example.myapplication.models.ResultModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {


    @FormUrlEncoded
    @POST("createuser")
    Call<ResultModel> createUser(
            @Field("firstname") String firstname,
            @Field("lastname") String lastname,
            @Field("email") String email,
            @Field("password") String password,
            @Field("phone") int phone,
            @Field("region") int region,
            @Field("state") String state,
            @Field("block") String block,
            @Field("street") String street,
            @Field("building") String building,
            @Field("floor") String floor,
            @Field("flat") String flat
    );



    @GET("allregion")
    Call<RegionModel> allRegions();


    @FormUrlEncoded
    @POST("userlogin")
    Call<LoginResponse> userlogin(
            @Field("email") String email,
            @Field("password") String password
    );
}
