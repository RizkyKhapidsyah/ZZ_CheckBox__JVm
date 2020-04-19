package com.rk.cb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox CB_1_IDJAVA, CB_2_IDJAVA, CB_3_IDJAVA;
    Button B_1_IDJAVA;
    TextView TV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CB_1_IDJAVA = findViewById(R.id.CB_1_IDXML);
        CB_2_IDJAVA = findViewById(R.id.CB_2_IDXML);
        CB_3_IDJAVA = findViewById(R.id.CB_3_IDXML);
        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
    }

    public void onClick(View Lihat) {
        if (CB_1_IDJAVA.isChecked() == true && CB_2_IDJAVA.isChecked() == true && CB_3_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Semua Buah!");
        } else if (CB_1_IDJAVA.isChecked() == true && CB_2_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Pisang dan Apel!");
        } else if (CB_1_IDJAVA.isChecked() == true && CB_3_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Pisang dan Jeruk!");
        } else if (CB_2_IDJAVA.isChecked() == true && CB_3_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Apel dan Jeruk!");
        } else if (CB_1_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Pisang");
        } else if (CB_2_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Apel");
        } else if (CB_3_IDJAVA.isChecked() == true) {
            TV_1_IDJAVA.setText("Kamu Menyukai Jeruk");
        } else {
            TV_1_IDJAVA.setText("Kamu Tidak Menyukai Buah Apapun :(");
        }
    }
}
