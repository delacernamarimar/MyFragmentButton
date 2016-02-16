package com.example.delacerna.myfragmentbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        ListFragment.Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //@Override
    public void Message(String OS_Name) {
        DetailFragment detailfragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detail_Fragment);
        if (detailfragment != null && detailfragment.isInLayout()) {
            detailfragment.setText(OS_Name);
        } else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            Bundle extras = new Bundle();
            extras.putString(DetailActivity.os_name, OS_Name);
            intent.putExtras(extras);
            startActivity(intent);

        }

    }
}
