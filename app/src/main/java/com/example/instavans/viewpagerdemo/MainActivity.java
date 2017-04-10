package com.example.instavans.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ViewPager viewPager;
    private android.support.v4.view.PagerAdapter adapter;
    private EditText editText;
    private TextView mainText;
    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        editText = (EditText) findViewById(R.id.editText);
        mainText = (TextView) findViewById(R.id.mainTextView);

        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();

        Log.d(TAG, oneFragment.toString());
        Log.d(TAG, twoFragment.toString());

        adapter = new CustomPagerAdapter(getSupportFragmentManager(),oneFragment,twoFragment);
        viewPager.setAdapter(adapter);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                oneFragment.setText(s.toString());
                twoFragment.setText(s.toString());
                mainText.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
