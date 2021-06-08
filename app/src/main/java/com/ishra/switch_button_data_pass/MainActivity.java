package com.ishra.switch_button_data_pass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
Switch simpleswitch1,simpleswitch2;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        simpleswitch1=findViewById(R.id.switch1);
        simpleswitch2=findViewById(R.id.switch2);
        submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statuswitch1,statuswitch2;
                Intent intent=new Intent(getApplicationContext(),Second.class);
                if(simpleswitch1.isChecked())
                    statuswitch1=simpleswitch1.getTextOn().toString();
                else
                    statuswitch1=simpleswitch1.getTextOff().toString();
                if(simpleswitch2.isChecked())
                    statuswitch2=simpleswitch1.getTextOn().toString();
                else
                    statuswitch2=simpleswitch1.getTextOff().toString();
               intent.putExtra("k",statuswitch1);
                intent.putExtra("k2",statuswitch2);
                startActivity(intent);
            }
        });
    }



}
