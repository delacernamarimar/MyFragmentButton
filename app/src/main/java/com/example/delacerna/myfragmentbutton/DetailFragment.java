package com.example.delacerna.myfragmentbutton;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DelaCerna on 05/12/2015.
 */
public class DetailFragment extends Fragment {
    TextView view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }

    // we call this method when button from listfragment is clicked
    public void setText(String item) {

        view = (TextView) getView().findViewById(R.id.text);
        view.setText(item);
    }
}
