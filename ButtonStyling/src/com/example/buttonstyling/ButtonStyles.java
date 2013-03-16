package com.example.buttonstyling;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ButtonStyles extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_styles);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_button_styles, menu);
        return true;
    }
}
