package com.example.roger.fakeword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {
    TextView editTitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        Intent intent = getIntent();
        String message = intent.getStringExtra("InText");
        editTitulo = findViewById(R.id.TVEditTitulo);
        editTitulo.setText(message);
    }

    public void saveME(View view) {
        String returnText= editTitulo.getText().toString();
        Intent data = new Intent(this,DocActivity.class);
        data.putExtra("result" ,returnText);
        setResult(RESULT_OK,data);
        finish();
    }
}
