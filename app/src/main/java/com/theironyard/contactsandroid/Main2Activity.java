package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nameBox;
    TextView phoneBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String content = getIntent().getStringExtra("content");
        setContentView(R.layout.activity_main2);

        nameBox = (TextView) findViewById(R.id.nameBox);
        phoneBox = (TextView) findViewById(R.id.phoneBox);

        nameBox.setText(content);
    }
}
