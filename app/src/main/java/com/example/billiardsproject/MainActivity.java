package com.example.billiardsproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BilliardsBall ball = new BilliardsBall(this);
        setContentView(ball);


    }
}
