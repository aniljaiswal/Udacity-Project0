package com.aniljaiswal.udacity_project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mAppToast = null;

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

        //Cancel any existing toasts
        if(this.mAppToast !=null) {
            this.mAppToast.cancel();
        }

        Button b = (Button)button;

        String msg = "This button will launch my " + b.getText().toString() + " app.";

        this.mAppToast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
        this.mAppToast.show();

    }

}
