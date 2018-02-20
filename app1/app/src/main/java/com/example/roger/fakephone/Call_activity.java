package com.example.roger.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Call_activity extends AppCompatActivity {

    TextView phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activity);

        //phone textview set
        phoneNumber=findViewById(R.id.PhoneNumberID);

    }
    public void butonPress(View v){
        Button b = (Button)v;
        phoneNumber.setText(phoneNumber.getText().toString()+b.getText());
    }

    public void EsborraNum(View view) {
        phoneNumber.setText("");
    }

    public void TrucaNum(View view) {
        String phoneNUM = phoneNumber.getText().toString();
        if(!phoneNUM.isEmpty()){
            Toast.makeText(this, "Trucant al "+phoneNUM, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No hi ha cap numero marcat", Toast.LENGTH_SHORT).show();
        }

    }
}
