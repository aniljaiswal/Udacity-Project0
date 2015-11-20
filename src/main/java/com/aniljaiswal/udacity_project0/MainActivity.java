package com.aniljaiswal.udacity_project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * Handle button clicks dynamically and show a toast message
     * @param button the button being clicked
     */
    public void buttonOnClick(View button) {

        Button b = (Button)button;

        Toast.makeText(MainActivity.this, "This button will launch my " + b.getText().toString() + " app.", Toast.LENGTH_SHORT).show();

    }

}
