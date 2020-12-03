package com.example.bottomnavigation.Message;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigation.Account.Account;
import com.example.bottomnavigation.Dashboard.Dashboard;
import com.example.bottomnavigation.Main.MainActivity;
import com.example.bottomnavigation.R;
import com.example.bottomnavigation.Search.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.message);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.message:


                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;
                }
            }
        });
    }
}