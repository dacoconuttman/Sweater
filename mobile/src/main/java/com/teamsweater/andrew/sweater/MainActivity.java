package com.teamsweater.andrew.sweater;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.view.MenuItem;
import android.content.Intent;
import com.firebase.client.Firebase;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
    }

    public void openMenu(){
        Intent intent = new Intent(MainActivity.this,showMenu.class);
        MainActivity.this.startActivity(intent);
    }

    public void openMap(){
        Intent intent = new Intent(MainActivity.this,showMap.class);
        MainActivity.this.startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void populateList(){
        Firebase myFirebaseRef = new Firebase("https://sweater.firebaseio.com/");

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
