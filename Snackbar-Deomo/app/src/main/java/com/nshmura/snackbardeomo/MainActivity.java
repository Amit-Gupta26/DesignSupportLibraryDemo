package com.nshmura.snackbardeomo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = findViewById(R.id.container);
        findViewById(R.id.show_snackbar_singleline).setOnClickListener(this);
        findViewById(R.id.show_snackbar_multiline).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.show_snackbar_singleline:
                Snackbar.make(mContainer, R.string.snackbar_text_singleline, Snackbar.LENGTH_SHORT)
                        .setAction(R.string.snackbar_action, this)
                        .show();
                break;

            case R.id.show_snackbar_multiline:
                Snackbar.make(mContainer, R.string.snackbar_text_multiline, Snackbar.LENGTH_SHORT)
                        .setAction(R.string.snackbar_action, this)
                        .show();
                break;
        }
    }
}
