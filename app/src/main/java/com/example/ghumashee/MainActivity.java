package com.example.ghumashee;

import android.os.Binder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button CircleBtn;
    Button SquareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.viewShape);
        CircleBtn = findViewById(R.id.button1);
        SquareBtn = findViewById(R.id.button2);

        CircleBtn.setOnClickListener(v -> {
            Circle circle = new Circle("circle", 5);
            String Area = "Area : " + circle.area();
            String Perimeter = "Perimeter : " + circle.parimeter();
            textView.setText(Area + "\n" + Perimeter);
        });

        SquareBtn.setOnClickListener(v -> {
            Square square = new Square("square", 5);
            String Area = "Area : " + square.area();
            String Perimeter = "Perimeter : " + square.parimeter();
            textView.setText(Area + "\n" + Perimeter);
        });



    }
}