package com.nshmura.floatinglabelsdemo;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout mTextInputLayoutName;
    private TextInputLayout mTextInputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.send_button).setOnClickListener(this);
        mTextInputLayoutName = (TextInputLayout) findViewById(R.id.text_input_layout_name);
        mTextInputLayoutPassword = (TextInputLayout) findViewById(R.id.text_input_layout_password);
    }

    @Override
    public void onClick(View v) {
        mTextInputLayoutName.setError(getString(R.string.error_text_name));
        mTextInputLayoutPassword.setError(getString(R.string.error_text_password));
    }
}