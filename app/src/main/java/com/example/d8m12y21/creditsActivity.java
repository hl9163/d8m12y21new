package com.example.d8m12y21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

/**
 * @author		Harel Leibovich <address @ example.com>
 * @version	1.0 (current version number of program)
 * @since		10/12/2021 (the date of the package the class was added)
 * credit activity
 */

public class creditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    /**
     * return the the first activity.
     * <p>
     *
     */
    public void returnFistAc(View view) {
        finish();
    }
}