package com.example.roger.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Call_activity extends AppCompatActivity {


    HashMap<String, Integer> buttonIDStoVal=new HashMap<String, Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activity);
        //
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

    }
    public void butonPress(View v){
        String id =v.getResources().getResourceEntryName(v.getId());
        int value=buttonIDStoVal.get(id);
        Toast.makeText(this, Integer.toString(value), Toast.LENGTH_SHORT).show();
    }

}
