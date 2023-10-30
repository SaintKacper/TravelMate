package com.example.travelmate;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import org.osmdroid.api.IMapController;
import org.osmdroid.views.MapView;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;

public class MainActivity extends Activity {
    private MapView mapView;
    private IMapController mapController;
    private Button locateMeButton;
    private ImageButton compassButton;
    private ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja mapy OpenStreetMap
        mapView = findViewById(R.id.mapView);
        mapView.setTileSource(TileSourceFactory.MAPNIK);

        mapController = mapView.getController();
        mapController.setZoom(15);  // Ustaw zoom mapy na 15 (zmień na odpowiednią wartość).

        // Inicjalizacja przycisków
        locateMeButton = findViewById(R.id.locateMeButton);
        compassButton = findViewById(R.id.compassButton);
        menuButton = findViewById(R.id.menuButton);

        // Skalowanie ikon do rozmiaru przycisków
        compassButton.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        menuButton.setScaleType(ImageButton.ScaleType.FIT_CENTER);

        locateMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tutaj możesz dodać kod do lokalizacji użytkownika.
                // Możesz użyć Google Maps API lub innych narzędzi do śledzenia lokalizacji.
            }
        });

        compassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tutaj możesz dodać kod do obsługi kompasu.
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tutaj możesz dodać kod do rozwijania menu i obsługi dodatkowych opcji.
            }
        });
    }
}
