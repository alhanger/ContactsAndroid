package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    ArrayAdapter<String> contacts;
    ListView listView;
    EditText nameBar;
    EditText phoneBar;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        nameBar = (EditText) findViewById(R.id.nameBar);
        phoneBar = (EditText) findViewById(R.id.phoneBar);
        addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);

        contacts = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(contacts);
    }

    @Override
    public void onClick(View v) {
        String text1 = nameBar.getText().toString();
        String text2 = phoneBar.getText().toString();
        contacts.add(text1 + " " + "(" + text2 + ")");
        nameBar.setText("");
        phoneBar.setText("");
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        String itemToRemove = contacts.getItem(position);
        contacts.remove(itemToRemove);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
