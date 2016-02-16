package com.example.delacerna.myfragmentbutton;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by DelaCerna on 05/12/2015.
 */
public class ListFragment extends Fragment {

    private Communicator communicator;
    ListView lv;
    Button android_btn, ios_btn, windows_btn;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof Communicator) {
            communicator = (Communicator) activity;
        } else {
            throw new ClassCastException(activity.toString()
                    + " must implemenet MyListFragment.Communicator");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        // Initialize Views

        this.lv= (ListView) view.findViewById(R.id.listView);
        // set on click Listeners for buttons
        this.lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = (String) lv.getItemAtPosition(position).toString();
                        communicator.Message(item);
                    }
                }
        );

        return view;
    }

    //Create Interface
    public interface Communicator {
        public void Message(String OS_Name);
    }



    private void updateFragment(String OS_Name) {
        communicator.Message(OS_Name);
    }

}