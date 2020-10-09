package pens.lab.app.belajaractivity.modul.profile;

import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;
    private String email;
    private String password;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        Intent intent = getIntent();
        email = intent.getStringExtra("EMAIL");
        password = intent.getStringExtra("PASSWORD");

        profileFragment = new ProfileFragment(email, password);
        setCurrentFragment(loginFragment, false);

    }



}
