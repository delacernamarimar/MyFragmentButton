package com.example.delacerna.myfragmentbutton;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DelaCerna on 05/12/2015.
 */
public class DetailActivity extends AppCompatActivity{

    public static String os_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.detail_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString(os_name);
            DetailFragment detailFragment = (DetailFragment) getFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            detailFragment.setText(name);
        }

    }

}

