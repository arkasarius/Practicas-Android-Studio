package com.example.roger.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Call_activity extends AppCompatActivity {


    HashMap<String, Integer> buttonIDStoVal=new HashMap<String, Integer>();
    TextView phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activity);
        //
        //hashMap values
        buttonIDStoVal.put("btn_0",0);
        buttonIDStoVal.put("btn_1",1);
        buttonIDStoVal.put("btn_2",2);
        buttonIDStoVal.put("btn_3",3);
        buttonIDStoVal.put("btn_4",4);
        buttonIDStoVal.put("btn_5",5);
        buttonIDStoVal.put("btn_6",6);
        buttonIDStoVal.put("btn_7",7);
        buttonIDStoVal.put("btn_8",8);
        buttonIDStoVal.put("btn_9",9);
        //phone textview set
        phoneNumber=findViewById(R.id.PhoneNumberID);

    }
    public void butonPress(View v){
        String id =v.getResources().getResourceEntryName(v.getId());
        int value=buttonIDStoVal.get(id);
        Toast.makeText(this, Integer.toString(value), Toast.LENGTH_SHORT).show();
    }

    public void EsborraNum(View view) {
        phoneNumber.setText("");
    }

    public void TrucaNum(View view) {
        String phoneNUM = phoneNumber.getText().toString();
        if(!phoneNUM.isEmpty()){
            Toast.makeText(this, "Teucant al "+phoneNUM, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No hi ha cap numero marcat", Toast.LENGTH_SHORT).show();
        }

    }
}
