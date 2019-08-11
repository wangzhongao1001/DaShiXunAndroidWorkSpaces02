package com.wza.dashixunandroidworkspaces02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.rb_1)
    RadioButton rb1;
    @BindView(R.id.rg1)
    RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.rb_1, R.id.rg1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb_1:
                break;
            case R.id.rg1:
                break;
        }
    }
}
