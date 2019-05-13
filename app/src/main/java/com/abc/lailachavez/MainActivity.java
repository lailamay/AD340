package com.abc.lailachavez;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.abc.lailachavez.R;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        button = (Button) findViewById(R.id.button2_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButton2();
            }
        });
    }

    public void openButton2() {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message1, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast2(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message2, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast3(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message3, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast4(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message4, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast5(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message5, Toast.LENGTH_SHORT);
        toast.show();
    }


}