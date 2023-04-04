package com.example.frontend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class selectButton extends AppCompatActivity {

    public Button button;
    public Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_button);
        button = (Button) findViewById(R.id.button1);
        button1 = (Button) findViewById(R.id.button2);
    }
}
