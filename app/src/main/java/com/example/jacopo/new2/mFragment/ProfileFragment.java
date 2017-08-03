package com.example.jacopo.new2.mFragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jacopo.new2.MainActivity;
import com.example.jacopo.new2.R;

public class ProfileFragment extends Fragment {

    public Button button;
    private Toolbar myToolbar;

//    private static final int MENU_SETT = Menu.FIRST;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_profile, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar();
        Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar2);
        toolbar.setTitle(getString(R.string.profile));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setHasOptionsMenu(true);

        Button button=(Button) v.findViewById(R.id.button_sett);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0,0);

            }
        });

        return v;

    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }*/



/*    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.add(0, MENU_SETT, Menu.NONE, R.string.search).setIcon(R.drawable.ic_settings);
        // TODO Add your menu entries here
        super.onCreateOptionsMenu(menu, inflater);
    }*/

/*    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        final MenuItem item = menu.findItem(R.id.settings);
        super.onCreateOptionsMenu(menu, inflater);
    }*/

/*    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.settings:
                Intent loginIntent = new Intent(ProfileFragment.this, MainActivity.class);
                startActivity(loginIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/

}


