package id.ac.poliban.mi.va.septi.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("result");
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("result", mCount);
        super.onSaveInstanceState(outState);
    }

    @SuppressLint("SetTextI18n")
    public void showCount(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}