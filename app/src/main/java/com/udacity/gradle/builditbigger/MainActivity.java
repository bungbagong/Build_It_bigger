package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bungbagong.androidlib.JokesActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {


        //RandomJokes randomJokes = new RandomJokes();
        //String joke = randomJokes.getJoke();
        //Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();

        new JokeAsyncTask(new JokeReceiveHandler()).execute();


    }

    private class JokeReceiveHandler implements JokeAsyncTask.OnJokeRetrievedListener {

        @Override
        public void onJokeRetrieved(String joke) {
            Intent intent = new Intent(MainActivity.this, JokesActivity.class);
            Log.d("bungbagong", "the string send =" + joke);
            intent.putExtra("joke", joke);

            startActivity(intent);
        }
    }


}
