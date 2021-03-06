package com.example.bottomnavigation.Account;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;

import com.example.bottomnavigation.Dashboard.Dashboard;
import com.example.bottomnavigation.Main.MainActivity;
import com.example.bottomnavigation.R;
import com.example.bottomnavigation.Search.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.account);

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
                        startActivity(new Intent(getApplicationContext(), Message.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.account:

                }
            }
        });
    }
}