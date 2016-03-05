package com.example.cosmas.modelviewcontrollerdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Model model;
    public MainActivity()
    {
        model = new Model();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         }

    public void processInput(View view)
    {
        EditText input = (EditText)findViewById(R.id.input);
        TextView output= (TextView)findViewById(R.id.output);
        model.addString(input.getText().toString());
        output.setText(model.getList());
        input.setText("");
    }
  }
