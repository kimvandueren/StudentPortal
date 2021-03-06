package com.example.kim.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddPortalActivity extends AppCompatActivity {
    String urlText;
    String titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText editUrlText = findViewById(R.id.editUrlText);
        final EditText editTitleText = findViewById(R.id.editTitleText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                urlText = editUrlText.getText().toString();
                titleText = editTitleText.getText().toString();

                editUrlText.setText("http://");
                editTitleText.setText("");

                Intent intent = new Intent(AddPortalActivity.this, OverviewActivity.class);
                intent.putExtra("textUrl", urlText);
                intent.putExtra("textTitle", titleText);

                startActivity(intent);
            }
        });

    }

}
