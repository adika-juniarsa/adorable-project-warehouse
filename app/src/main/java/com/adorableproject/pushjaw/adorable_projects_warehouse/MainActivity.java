package com.adorableproject.pushjaw.adorable_projects_warehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AndroidNetworking.initialize(getApplicationContext());
        AndroidNetworking.enableLogging();
        AndroidNetworking.get("http://trelevant.herokuapp.com/api/v1/keychain/generate/")
                .addQueryParameter("appkey", "vBUpPXE8ddpWp9QJ")
                .setTag("test")
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("response is", response.toString());
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.d("response is", anError.toString());
                    }
                });

        final Button buttonLogin = (Button) findViewById(R.id.loginBtn);
        buttonLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(v.getContext(), HomeActivity.class));
            }
        });

    }

}
