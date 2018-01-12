package com.example.maylisw.myapplication;

import com.example.maylisw.myapplication.Word;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by maylisw on 1/12/18.
 */

public interface DataMuseAPI {
    String baseURL = "api.datamuse.com";
    @GET("words")
    Call<List<Word>> getSoundsLike(@Query("sl") String word); // receives data asynchronously
}
