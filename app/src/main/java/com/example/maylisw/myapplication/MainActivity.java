package com.example.maylisw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create retrofit object assigning a url & convert factory
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DataMuseAPI.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instantiate an API
        DataMuseAPI api = retrofit.create(DataMuseAPI.class);

        Call<List<Word>> call = api.getSoundsLike("moone");
        call.enqueue(new Callback<List<Word>>() {
            @Override
            public void onResponse(Call<List<Word>> call, Response<List<Word>> response) {
                List<Word>  words = response.body();
                Log.d("tag you're it", "onResponse: " + words);
            }

            @Override
            public void onFailure(Call<List<Word>> call, Throwable t){
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG);
            }
        });
    }
}
