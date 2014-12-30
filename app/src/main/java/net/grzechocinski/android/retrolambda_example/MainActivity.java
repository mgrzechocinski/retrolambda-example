package net.grzechocinski.android.retrolambda_example;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    public interface OnProgressChangeListener {

        OnProgressChangeListener NULL = progress -> { };

        public void onProgressChanged(int progress);
    }

    OnProgressChangeListener onProgressChangeListener = OnProgressChangeListener.NULL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
