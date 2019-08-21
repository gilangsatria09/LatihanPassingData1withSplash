package com.example.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityInputGofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_input_gofood);
        final EditText nama = (EditText)findViewById(R.id.etnama);
        final EditText alamat = (EditText) findViewById(R.id.etalamat);
        final EditText pesan = (EditText) findViewById(R.id.etpesan);
        Button btn = (Button)findViewById(R.id.btnSubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityInputGofood.this,MainActivityHasilInput.class);
                i.putExtra("nama",nama.getText().toString());
                i.putExtra("alamat",alamat.getText().toString());
                i.putExtra("pesan",pesan.getText().toString());
                startActivity(i);
            }
        });

    }
}
