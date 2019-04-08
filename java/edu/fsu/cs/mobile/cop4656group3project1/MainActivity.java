package edu.fsu.cs.mobile.cop4656group3project1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        loginFragment = new LoginFragment();
        trans.add(R.id.main_container, loginFragment, "my_login_fragment");
        trans.commit();
    }
}
