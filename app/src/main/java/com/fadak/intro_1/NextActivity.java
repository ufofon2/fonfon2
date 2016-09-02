package com.fadak.intro_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        setTitle("선민이가 수정한 액티비티");
    }
}
