package com.example.part1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView mytextView = findViewById(R.id.myText);
        mytextView.setText("Hi From Java");

        EditText myeditText = findViewById(R.id.editText);

        String inputText = myeditText.getText().toString();

        mytextView.setText(inputText);

        Button myBtn = findViewById(R.id.myBtn);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(MainActivity.this,"You click the button", Toast.LENGTH_SHORT).show();

            }
        });

    }
}