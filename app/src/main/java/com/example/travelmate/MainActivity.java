package com.example.travelmate;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.app.Activity;
import android.widget.Button;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.travelmate.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Button locateMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Tutaj wskazuje się layout interfejsu użytkownika (plik XML).

        locateMeButton = findViewById(R.id.locateMeButton); // Pobieranie referencji do przycisku z layoutu.

        locateMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tutaj dodajesz kod do lokalizacji użytkownika.
                // Możesz użyć Google Maps API lub innych narzędzi do śledzenia lokalizacji.
            }
        });
    }
}