package com.abc.lailachavez2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message1,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    public void showToast1(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message2,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast2(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message3,
                Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(getApplicationContext(), RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void showToast3(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message4,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast4(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message5,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
