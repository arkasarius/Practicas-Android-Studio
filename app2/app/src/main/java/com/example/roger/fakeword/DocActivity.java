package com.example.roger.fakeword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DocActivity extends AppCompatActivity {
    TextView TVtitulo;
    TextView TVCuerpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
        TVCuerpo = findViewById(R.id.TVcuerpo);
        TVtitulo = findViewById(R.id.TVtitulo);
    }


    public void EditME(View view){
        Intent intent = new Intent(this, EditTextActivity.class);
        String message;
        switch (view.getId()) {
            case R.id.TVtitulo:
                message = TVtitulo.getText().toString();
                intent.putExtra("InText", message);
                startActivityForResult(intent,0);
                break;
            case R.id.TVcuerpo:
                message = TVCuerpo.getText().toString();
                intent.putExtra("InText", message);
                startActivityForResult(intent,1);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String message;
        switch (requestCode) {
            case 0:
                if (resultCode == RESULT_OK) {
                    message = data.getStringExtra("result");
                    TVtitulo.setText(message);
                }
                break;
            case 1:
                if (resultCode == RESULT_OK) {
                    message = data.getStringExtra("result");
                    TVCuerpo.setText(message);
                }
                break;
            default:
                break;
        }

    }
}
