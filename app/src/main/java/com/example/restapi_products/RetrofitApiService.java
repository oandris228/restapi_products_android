package com.example.restapi_products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    // GET all users
    @GET("FNzMlz/data")
    Call<List<Product>> getAllPeople();

    // GET user by ID
    @GET("FNzMlz/data/{id}")
    Call<Product> getPeopleById(@Path("id") int id);

    // POST (create a new user)
    @POST("FNzMlz/data")
    Call<Product> createPeople(@Body Product product);

    // PUT (update a user)
    @PUT("FNzMlz/data/{id}")
    Call<Product> updatePeople(@Path("id") int id, @Body Product product);

    // DELETE (delete a user by ID)
    @DELETE("FNzMlz/data/{id}")
    Call<Void> deletePeople(@Path("id") int id);
}
