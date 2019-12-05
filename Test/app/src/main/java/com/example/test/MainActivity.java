package com.example.test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    Button.OnClickListener cListner = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            final TextView mainText = findViewById(R.id.textView3);
            mainText.setText(mainText.getText()+"hello");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        Button button6 = findViewById(R.id.button6);
        final TextView mainText = findViewById(R.id.textView3);

        findViewById(R.id.button6).setOnClickListener(cListner);




    }
}