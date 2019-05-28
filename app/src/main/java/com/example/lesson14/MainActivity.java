package com.example.lesson14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView _tvShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _tvShowCount = findViewById(R.id.show_count);

        mCount = 0;

    }

    public void countUp(View view) {
        ++mCount;
        if (_tvShowCount != null) {
            String sCount = Integer.toString(mCount);
            _tvShowCount.setText(sCount);
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_text,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
