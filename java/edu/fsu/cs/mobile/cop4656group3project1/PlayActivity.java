package edu.fsu.cs.mobile.cop4656group3project1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


//the "play" section of the app is done in this activity,
// mostly so we can fill this activity with listeners without cluttering MainActivity


public class PlayActivity extends AppCompatActivity {

    PlayFragment playFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //add fragment to view  (currently goes straight to a fake "play" screen
        FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        playFragment = new PlayFragment();
        trans.add(R.id.play_container, playFragment, "my_play_fragment");
        trans.commit();
    }

        //listener for the exit button in the PlayFragment
    public void exitPressed(View view) {
        //return from PlayFragment to lobby menu?
    }
}