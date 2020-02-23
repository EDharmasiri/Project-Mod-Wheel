package com.example.midiwheels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar testSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testSeekBar = findViewById(R.id.volume_seekBar);

        testSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                testSeekBar.performHapticFeedback(HapticFeedbackConstants.TEXT_HANDLE_MOVE,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
