package edu.oru.cit352.ckmung1.bibleverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Bible display function
    private void displayVerse() {
        // getting the resource
        Resources res = getResources();
    }
}