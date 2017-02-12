package com.example.android.popularmoviestageone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private ImageAdapter movieImageAdapter;

    Movie [] movieData = {
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageAdapter = new ImageAdapter(this, Arrays.asList(movieData));

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(movieImageAdapter);

         }
        //Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);

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
//            if (id == R.id.action_settings) {
//                return true;
//            }

            return super.onOptionsItemSelected(item);
    }
}