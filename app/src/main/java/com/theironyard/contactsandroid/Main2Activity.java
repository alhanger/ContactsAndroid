package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    TextView nameBox;
    TextView phoneBox;
    EditText workPhoneBar;
    EditText emailBar;
    EditText addressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String content = getIntent().getStringExtra("content");
        setContentView(R.layout.activity_main2);

        nameBox = (TextView) findViewById(R.id.nameBox);
        //phoneBox = (TextView) findViewById(R.id.phoneBox);
        workPhoneBar = (EditText) findViewById(R.id.workPhoneBar);
        emailBar = (EditText) findViewById(R.id.emailBar);
        addressBar = (EditText) findViewById(R.id.addressBar);

        nameBox.setText(content);
    }

    @Override
    public void onClick(View v) {
        String workPhone = workPhoneBar.getText().toString();
        String email = emailBar.getText().toString();
        String address = addressBar.getText().toString();
        workPhoneBar.setText(workPhone);
        emailBar.setText(email);
        addressBar.setText(address);
    }
}
