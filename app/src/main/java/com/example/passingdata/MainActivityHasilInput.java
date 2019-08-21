package com.example.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityHasilInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hasil_input);
        TextView nama = (TextView) findViewById(R.id.tvNama2);
        TextView alamat = (TextView) findViewById(R.id.tvAlamat2);
        TextView pesan = (TextView) findViewById(R.id.tvPesan2);
        Bundle bundle = getIntent().getExtras();

        String n = bundle.getString("nama");
        String a = bundle.getString("alamat");
        String p = bundle.getString("pesan");

        nama.setText(n);
        alamat.setText(a);
        pesan.setText(p);

        Button btn = (Button) findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityHasilInput.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
